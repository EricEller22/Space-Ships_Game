import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 
 */
public class LetrasGlitch extends Gif
{
    GifImage LetrasGlitch = new GifImage("MOSHED-2023-6-2-15-15-1.gif");
    GreenfootImage imageOne;
    boolean notImageOne;
     
    public LetrasGlitch()
    {
        List<GreenfootImage> images = LetrasGlitch.getImages(); // get list of images
        imageOne = images.get(0); // get reference to first image
        for (GreenfootImage img : images) img.scale(1280, 720); // scale all images
        setImage(LetrasGlitch.getCurrentImage()); // set initial image
    }
  
    public void act() 
    {
        setImage(LetrasGlitch.getCurrentImage()); // animate
        if ((getImage() != imageOne) != notImageOne) // was there a change involving first image
        {
            notImageOne = ! notImageOne; // record change
            if (! notImageOne) {
                
                getWorld().removeObject(this); // if setting first image, remove explosion from world
            }
        }
        
    }
}

