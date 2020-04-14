package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {
  public void settings() {
    size(500, 500);
  }

  public void setup() {

  }

  public void loops1() {
    // Adds color to the line
    stroke(255);
    // Determines the number of lines on the screen
    /*
     * max lines 30 - mouseX / (float) width; mouseX = x-axis of mouse; (0 <= mouseX
     * <= width - 1); width = width of screen = 500; (mouseX / (float) width) < 1;
     * 20/500
     */
    int numLines = (int) (30 * (mouseX / (float) width));
    // Gap between each line
    float gap = width / (float) numLines;
    // Draws each line
    // gap = 166 if numLines = 3
    for (int i = 0; i <= numLines; i++) {
      // i = 0, gap = 166
      // x = 0
      float x = i * gap;
      // x1=0, y1=0, x2=500, y2=500
      line(x, 0, width - x, height);
      // x1=0, y1=0, x2=500, y2=500
      line(0, x, width, height - x);
    }
  }

  float offset = 0;

  public void loops2() {
    int numCircles = (int) (20 * (mouseX / (float) width));

    float w = width / (float) numCircles;
    float radius = w / 2.0f;
    colorMode(HSB);
    float cGap = 255 / (float) (numCircles * numCircles);
    noStroke();

    for (int j = 0; j < numCircles; j++) {
      for (int i = 0; i < numCircles; i++) {
        float x = radius + (i * w);
        float y = radius + (j * w);
        float c = (cGap * i * j + offset) % 255;
        fill(c, 255, 255);
        ellipse(x, y, w, w);
      }
    }
    offset += mouseY / 250.0f;
  }

  public void loops3() {
    float gap = width * 0.1f;
    float halfGap = gap / 2.0f;
    colorMode(RGB);
    stroke(0, 255, 0);
    textAlign(CENTER, CENTER);
    for (int i = -5; i <= 5; i++) {
      float x = map(i, -5, 5, gap, width - gap);
      line(x, gap, x, height - gap);
      line(gap, x, width - gap, x);
      fill(255);
      text(i, x, halfGap);
      text(i, halfGap, x);

    }
  }

  public void keyPressed() {
    if (key == ' ') {

    }
  }

  public void draw() {
    background(0);
    colorMode(HSB);
    //loops1();

    //loops2();

    loops3();
  }
}
