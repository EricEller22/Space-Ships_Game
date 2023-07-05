import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class letrasGlitch2 extends Gif
{
    GifImage letrasGlitch2 = new GifImage("MOSHED-2023-6-2-13-55-35.gif");
    GreenfootImage imageOne;
    boolean notImageOne;
     
    public letrasGlitch2()
    {
        List<GreenfootImage> images = letrasGlitch2.getImages(); // get list of images
        imageOne = images.get(0); // get reference to first image
        for (GreenfootImage img : images) img.scale(1280, 720); // scale all images
        setImage(letrasGlitch2.getCurrentImage()); // set initial image
    }
 
    public void act() 
    {
        setImage(letrasGlitch2.getCurrentImage()); // animate
      
    }
}
