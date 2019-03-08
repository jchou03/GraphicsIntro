/*
 * File: MyGraphicsProgram.java
 * Name: 
 * -----------------
 * This file is the starter file for any graphics program
 * you would like to write. There are no limits on your 
 * creativity!
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class MyGraphicsProgram extends GraphicsProgram {
	private static final int HEIGHT = 50;
	private static final int WIDTH = 50;
	public void run() {

		GRect ground = new GRect(0,getCanvasHeight() * 2/3,getCanvasWidth(),getCanvasHeight()/3);
		ground.setFilled(true);
		ground.setColor(Color.green);
		add(ground);
		GRect sky = new GRect(0,0,getCanvasWidth(),getCanvasHeight() * 2/3);
		sky.setFilled(true);
		sky.setColor(Color.cyan);
		add(sky);
		GOval oval = new GOval(getCanvasWidth()/2 - HEIGHT/2,getCanvasHeight()/2-WIDTH/2,WIDTH,HEIGHT);
		oval.setFilled(true);
		oval.setColor(Color.yellow);
		add(oval);
		GOval ball = new GOval(10,10,10,10);
		ball.setFilled(true);
		ball.setColor(Color.white);
		add(ball);
		GOval ball1 = new GOval(20,10,10,10);
		ball1.setFilled(true);
		ball1.setColor(Color.white);
		add(ball1);
	}

}
