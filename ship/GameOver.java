import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class GameOver extends Gif
{
    GifImage GameOver = new GifImage("MOSHED-2023-6-2-15-7-54.gif");
    GreenfootImage imageOne;
    boolean notImageOne;
    //int stop;
    public GameOver(){
        List<GreenfootImage> images = GameOver.getImages(); // get list of images
        imageOne = images.get(0); // get reference to first image
        for (GreenfootImage img : images) img.scale(1280, 720); // scale all images
        setImage(GameOver.getCurrentImage()); // set initial image
    }
 
    public void act() 
    {
        setImage(GameOver.getCurrentImage());
    }
}
