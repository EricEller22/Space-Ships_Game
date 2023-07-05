import greenfoot.*;
import java.util.List;
  
public class explosion extends Actor
{
    GifImage explosion = new GifImage("531846_0e37b.gif");
    GreenfootImage imageOne;
    boolean notImageOne;
     
    public explosion()
    {
        List<GreenfootImage> images = explosion.getImages(); // get list of images
        imageOne = images.get(0); // get reference to first image
        for (GreenfootImage img : images) img.scale(100, 100); // scale all images
        setImage(explosion.getCurrentImage()); // set initial image
    }
 
    public void act() 
    {
        setImage(explosion.getCurrentImage()); // animate
        if ((getImage() != imageOne) != notImageOne) // was there a change involving first image
        {
            notImageOne = ! notImageOne; // record change
            if (! notImageOne) getWorld().removeObject(this); // if setting first image, remove explosion from world
        }
    }
}
