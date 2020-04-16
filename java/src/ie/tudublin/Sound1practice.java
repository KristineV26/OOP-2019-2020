package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.*;

public class Sound1practice extends PApplet
{
    Minim minim;
    AudioInput ai;

    FFT fft;

    int framesize = 1024;
    int samplerate = 44100;

    public void settings()
    {
        size(1024, 500);
    }

    public void setup()
    {
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO, width, 44100, 16);

        colorMode(HSB);
        circy = height / 2;
        lerpedcircly = circy;

        fft = new FFT(framesize, samplerate);

    }

    float offs = 0;

    float circy;
    float lerpedcircly;
    float lerpedw;

    public void draw()
    {
        background(0);
        stroke(255);
        float cy = height /2;
        float sum = 0;
        for(int i = 0; i < ai.bufferSize(); i++)
        {
            stroke(
                map(i, 0, ai.bufferSize(), 0, 255),
                255,
                255
            );
            //line(i, cy, i, cy + ai.left.get(i) * cy);
            sum += abs(ai.left.get(i));
        }
        float average = sum / ai.bufferSize();
        
        float w = average * 1000;
        lerpedw = lerp(lerpedw, w, 0.1f);
        noStroke();
        fill(
            map(average, 0, 1, 0, 255)
            , 255
            , 255
        );
        //ellipse(400 , cy,w, w);
        //ellipse(600 , cy,lerpedw, lerpedw);
        
        for (int i = 0; i < ai.bufferSize(); i++)
        {
            stroke(
                map(i, 0, ai.bufferSize(), 0, 255),
                255,
                255
            );
            line(i, cy, i, cy + ai.left.get(i) * cy);
        }

        circy += random(-20, 20);
        lerpedcircly = lerp(lerpedcircly, circy, 0.1f);
        //ellipse(100, circy, 50, 50);
        //ellipse(200, lerpedcircley, 50, 50);
        
        fft.window(FFT.HAMMING);
        fft.forward(ai.left);

        stroke(255);
        for(int i = 0; i < fft.specSize(); i++)
        {
            line(i, 0, i, fft.getBand(i) * 100);
        }
    }
}