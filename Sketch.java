import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  PImage imgMushroom;

// x and y coordinate for mushroom
  float fltMushroomX = 0;
  float fltMushroomY = 0;

  // speed for the mushroom
  float fltXSpeed = 3;
  float fltYSpeed = 3;
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
    // load image
    imgMushroom = loadImage("png.png");
    // resize image
    imgMushroom.resize(imgMushroom.width/4, imgMushroom.height/4);

  }

  public void draw() {


  // moving 
  image(imgMushroom. fltMushroomX, fltMushroomY);

    fltMushroomX += fltXSpeed;
    fltMushroomY += fltYSpeed;
 
    if (fltMushroomX > width - imgMushroom.width) {
      fltXSpeed *= -1;
    }

    if (fltMushroomY > height - imgMushroom.height || fltMushroomY < 0) {
      fltYSpeed *= -1;
    }

  
}


}



