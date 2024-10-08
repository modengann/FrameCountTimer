import processing.core.*;

public class App extends PApplet{
    int frameWhenClicked = -30;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup(){
        
    }

    public void settings(){
        size(800, 600);
    }

    public void draw(){
        background(255);
        if(frameWhenClicked + 30 >= frameCount){
            ellipse(50, 50, 100, 100);
        }   
       

    }

    public void mousePressed(){
        frameWhenClicked = frameCount;
    }
}
