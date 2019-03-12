import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseStuff extends GraphicsProgram{
    GRect pet = new GRect(0,0,50,50);
    public void run(){
        pet.setFilled(true);
        pet.setColor(Color.yellow);
        add(pet);
        addMouseListeners();
    }
    public void mouseMoved(MouseEvent e){
        double mouseX = e.getX();
        double mouseY = e.getY();
        int mousePercentX = (int)(mouseX/getWidth() * 255);
        int mousePercentY = (int)(mouseY/getHeight() * 255);
        Color c = new Color(mousePercentX,mousePercentY,(mousePercentX + mousePercentY)/2);
        GOval oval = new GOval(mouseX - 10,mouseY-10,20,20);
        oval.setFilled(true);
        oval.setColor(c);
        add(oval);
    }
    public void mouseClicked(MouseEvent e){

        double mouseX = e.getX();
        double mouseY = e.getY();

        petMove(e);
    }
    public void petMove(MouseEvent e){
        double mouseX = e.getX();
        double mouseY = e.getY();

        double distX = mouseX - pet.getX();
        double distY = mouseY - pet.getY();
        System.out.println("distX: " + distX);
        System.out.println("distY: " + distY);
        while(pet.getX() != mouseX && pet.getY() != mouseY){
            System.out.println("in while loop");
            pet.move(distX/2,distY/2);
            pause(100);
        }

        //pet.move(mouseX-pet.getX()-pet.getWidth()/2,mouseY-pet.getY()-pet.getHeight()/2);
        pet.sendToFront();
    }
}
