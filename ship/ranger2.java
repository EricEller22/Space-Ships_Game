import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ranger2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ranger2 extends Inimigo{  
    public void ranger2(){
        
        }
    public void act()
    {
        if (Greenfoot.getRandomNumber(200) == 1){
            atirarCons();
        }
        setRotation(90);
        move(1);
        removerInimigo();
    }
    private void atirarCons(){      
        TiroInimigo tiro = new TiroInimigo();
        getWorld().addObject(tiro, this.getX(), this.getY());
        tiro.setRotation(90);
        
    }

 }

