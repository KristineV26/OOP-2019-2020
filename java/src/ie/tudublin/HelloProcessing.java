package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}


	public void draw() {
		background(255, 0, 0);
		//stroke(255, 0, 0);
		fill(255, 255, 0);
		//line(10, 10, 100, 100);		// x1, y1, x2, y2
		//point(50, 50); // x, y
		ellipse(250,300, 400, 400); // cx, cy, w, h
		fill(0, 255, 255);
		triangle(20, 450, 250, 50, 480, 450); // vertices
		fill(180);	
		ellipse(250, 250, 220, 100);
		fill(0);
		ellipse(250, 250, 80, 80);
	}	
	

	int x = 0; // 4 bytes
	
	/*
	public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
	}*/
}
