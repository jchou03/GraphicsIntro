import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseStuff extends GraphicsProgram{
    GRect pet = new GRect(0,0,50,50);
    GRect stayPet = new GRect(100,100,30,30);
    boolean banana = false;
    double mouseX = 0;
    double mouseY = 0;

    public void run(){
        addMouseListeners();

        pet.setFilled(true);
        pet.setColor(Color.yellow);
        add(pet);
        stayPet.setFilled(true);
        stayPet.setColor(Color.cyan);
        add(stayPet);
        while(true) {
            if (banana) {
                System.out.println("Banana is true");
                glide(mouseX, mouseY);
            }
            pause(50);
        }
    }
    public void mouseMoved(MouseEvent e){
        mouseX = e.getX();
        mouseY = e.getY();
        int mousePercentX = (int)(mouseX/getWidth() * 255);
        int mousePercentY = (int)(mouseY/getHeight() * 255);
        Color c = new Color(mousePercentX,mousePercentY,(mousePercentX + mousePercentY)/2);
        GOval oval = new GOval(mouseX - 10,mouseY-10,20,20);
        oval.setFilled(true);
        oval.setColor(c);
        add(oval);
        stayPet.move(mouseX - stayPet.getX()-15,mouseY-stayPet.getY()-15);
    }
    public void mouseClicked(MouseEvent e){
        mouseX = e.getX();
        mouseY = e.getY();
        banana = true;
    }
    public void mouseReleased(MouseEvent e){
        banana = false;
    }
    public void glide(double mouseX, double mouseY){
        double distX = mouseX - pet.getX();
        double distY = mouseY - pet.getY();
        while(!(closeEnough(pet.getX(),mouseX)&& closeEnough(pet.getY(),mouseY))){
            System.out.println("in while loop");
            pet.move(distX/500,distY/500);
            pause(5);
        }
        banana = false;
    }
    public boolean closeEnough(double val1, double val2){
        if(val1 > val2 && val1 - 10 < val2){
            return true;
        }else if(val1 < val2 && val1 + 10 > val2){
            return true;
        }else if(val1 == val2){
            return true;
        }
        return false;
    }
}
