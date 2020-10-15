package loopingtimers;

import processing.core.PApplet;


public class LoopingTimers extends PApplet { 
public int startTime;
public int timer;
public int count;
public int colorState = 0;	
public int[][] catPoints = {{10, 10}, {12, 12}, {14, 14}, {15, 18}, 
            {18, 22}, {21, 27}, {21, 32}, {24, 28}, {23, 24}, {23, 20}, 
            {25, 18}, {28, 18}, {27, 20}, {25, 21}, {25, 25}, {25, 30}, 
            {21, 34}, {13, 34}, {10, 34}, {11, 32}, {14, 33}, {11, 30}, 
            {11, 28}, {10, 30}, {9, 34}, {7, 33}, {8, 33}, {8, 30}, {7, 27}, 
            {7, 24}, {8, 21}, {9, 18}, {7, 17}, {6, 16}, {7, 13}, {9, 12}, 
            {10, 10}};
	
	
	
	
	
	
	
	
	
	public void setup() { 
		count = catPoints.length - 1;
		size(800, 600);
        background(255, 255, 255);
        startTime = millis();
        for(int i = 0; i < catPoints.length; i++)
        {
            catPoints[i][0] *= 15;
            catPoints[i][1] *= 15;
        }
	
	}

	public void draw() {
	
		timer = millis() - startTime;
		 if(colorState == 0)
	        {
	            stroke(255, 105, 0);
	        }
	        if(colorState == 1)
	        {
	            stroke(0, 105, 255);
	        }
	        if(colorState == 2)
	        {
	            stroke(155, 155, 155);
	        }
		if(timer > 500 && count > 0)
        {
            System.out.println("1/2 a second passed...");
            startTime = millis();
            
        	line(catPoints[count][0], catPoints[count][1], catPoints[count - 1][0], catPoints[count - 1][1]);
            count --;
        }}
	
	public void keyReleased()
	{
		if(key == ' ')
        {
            if(colorState < 2)
            {
                colorState ++;
            }
            else{
                colorState = 0;
            }
        }
	
	
	
	
	
	
	
	
	
	}
}
