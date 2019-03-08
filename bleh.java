import acm.graphics.*;
import acm.program.*;
import java.awt.*;

//This is the new verson of DrawCenteredRect and DrawCenteredRect1 because for some reason if that is in the name the class won't compile

public class bleh extends GraphicsProgram {
    private static final int WIDTH = 350;
    private static final int HEIGHT = 270;

    public void run(){
        GRect rect = new GRect(getCanvasWidth()/2 - WIDTH/2, getCanvasHeight()/2 - HEIGHT/2, WIDTH,HEIGHT);
        rect.setFilled(true);
        rect.setFillColor(Color.blue);
        add(rect);
    }
}
