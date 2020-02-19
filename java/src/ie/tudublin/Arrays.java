package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//syntax of array in java float[], array are objects
	//one way
	//float[] rainfall = new float[12];
	//second way
	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};//all are single constant if 58.0 is a double constant
	//not getting and error by converting int to float because there is not trancation, you will get an error the other way around
	String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Sep"};
	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0; i < rainfall.length; i++)//length is the length property in length
		{
			//we can use println because we are in PApplet
			println(month[i] + "\t" + rainfall[i]);
		}
		for(float f:rainfall)
		{
			println(f); //automatically iterates through array, enhanced while loop
		}

		for(String s:month)
		{
			println(s);
		}
/*
		int minindex = 0;

		for(int i = 0; i < rainfall.length; i++)
		{
			if(rainfall[i] < rainfall[minindex])
			{
				minindex = i;
			}
		}
		println(month[minindex] + "had minimum amount during " + month[i]);
	}*/

	/*
	public void maxRain()
	{
		for(int j = 0; j < month.length; j++)
		{	
			for(int i = 0; i < rainfall.lenth; i++)
			{
				if(rainfall[i] < rainfall[i+1])
				{
					month_name = month[j];
					rain_amt = rainfall[i];
				}
			}
		}
		println(month_name + rain_amt);*/
	}
/*
	void drawBarChart()
	{
		for(int i = 0; i < rainfall.length; i++)
		{
			fill(255);
			rect(10 * i, 5, 10, rainfall[i]);
		}
	}*/

	void drawBarChart()
	{
		float w = width / (float) rainfall.length;
		float cGap = 255 /(float) rainfall.length;
		noStroke();
		colorMode(HSB, 100);
		for(int i = 0; i < rainfall.length; i++)
		{
			float x = i *w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, rainfall[i]);
		}
	}
	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
		drawBarChart();
	}
}
