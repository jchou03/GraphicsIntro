/*
 * File: Pyramid.java
 * Name: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		/* You fill this in. */
//		drawRow(14,1);
//		drawRow(13,2);
		//drawBrick(0,-1*BRICK_HEIGHT + getHeight(),BRICK_WIDTH,BRICK_HEIGHT);
		buildPyrimid(14);
	}

	public void drawBrick(int x, int y, int width, int height) {
		GRect rect = new GRect(x,y,width,height);
		add(rect);
	}
	public void drawRow(int brickNum, int layer){
		int layerHeight = getHeight() - layer * BRICK_HEIGHT;
		if(brickNum%2 == 1) {
			for (int i = -brickNum / 2; i < brickNum / 2; i++) {
				System.out.println("i: " + i);
				drawBrick(getWidth() / 2 + i * BRICK_WIDTH, layerHeight, BRICK_WIDTH, BRICK_HEIGHT);
			}
		}else if(brickNum%2 == 0){
			for (int i = -brickNum/2 + 1;i < brickNum/2;i++){
				drawBrick(getWidth()/2 - BRICK_WIDTH/2 + i * BRICK_WIDTH,layerHeight,BRICK_WIDTH,BRICK_HEIGHT);
			}
		}
	}
	public void buildPyrimid(int baseNum){
		int layers = baseNum;
		for(int layer = 1; layer < layers; layer++){
			drawRow(baseNum - layer + 1,layer);
		}
	}
}

