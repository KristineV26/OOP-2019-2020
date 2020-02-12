package ie.tudublin;

import processing.core.PApplet;

public class BugZap1 extends PApplet
{
    float playerX, playerY;
    float playerWidth;
    float halfplayerWidth;

    public void settings()
    {
        size(500, 500);
    }
    public void setup()
    {
        playerX = width / 2;
        playerY = height - 50;
        playerWidth = 40;
        halfplayerWidth = playerWidth / 2;
    }

    public void drawPlayer(float x, float y, float w)
    {
        float playerHeight;
        playerHeight = w/2;

        rect(x - halfplayerWidth, y + halfplayerWidth, playerWidth, playerHeight);
        stroke(255);
        line(x, y, x, y + playerHeight * 0.3f);

    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            System.out.println("Left arrow pressed");
            playerX -= 5;
		}
		if (keyCode == RIGHT)
		{
            System.out.println("Right arrow pressed");
            playerX += 5;
		}
		if (key == ' ')
		{
            System.out.println("SPACE key pressed");
            stroke(255);
            line(playerX, playerY, playerX, 100);
		}
    }
    
    public void drawBug()
    {
        stroke(255);
        ellipse(250, 100, 150, 150);
    }
    

    public void draw()
	{	
		background(0);		
		fill(255);
        drawPlayer(playerX, playerY, playerWidth);
        drawBug();
	}
}