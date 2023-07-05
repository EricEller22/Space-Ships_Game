import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

public class Retangulo2 extends Imagens
{
    
    /**
     * Construtor do botão que
     * Precisa receber uma imagem como parametro
    */
       
   private World link;
   
   public Retangulo2(String image, World link){
        
        setImage(new GreenfootImage(image)); // Set imagem recebida pelo parâmetro da função (adicionada ao Inicio)
        this.link = link;
        
        
        
    } 
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
            
        }
    }
}

