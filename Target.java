/*
 * File: Target.java
 * Name: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

	private static final int HEIGHT = 270;
	public void run() {
		/* You fill this in. */

		GOval oval = new GOval(getWidth()/2 - 36,getHeight()/2 - 36, 72, 72);
		oval.setFilled(true);
		oval.setColor(Color.red);
		add(oval);
		GOval oval1 = new GOval(getWidth()/2 - 23.4,getHeight()/2 - 23.4,46.8,46.8);
		oval1.setFilled(true);
		oval1.setColor(Color.white);
		add(oval1);
		//21.6
		GOval oval2 = new GOval(getWidth()/2 - 10.8,getHeight()/2-10.8,21.6,21.6);
		oval2.setColor(Color.red);
		oval2.setFilled(true);
		add(oval2);
	}
}
