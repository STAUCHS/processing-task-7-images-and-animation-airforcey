import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    PImage img;

  size(300, 300);
  img = loadImage("image.webp");
  image(img, 0, 0);
}


}



