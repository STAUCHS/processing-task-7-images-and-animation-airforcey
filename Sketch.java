import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  PImage img;


  public void settings() {
    size(800, 800);
  }

  public void setup() {
    background(210, 255, 173);
    img = loadImage("png.png");

  }

  public void draw() {
  image(img, 0, 0);

  
}


}



