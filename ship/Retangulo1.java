import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Classe para botão de inicio 
 */
public class Retangulo1 extends Imagens
{
    
    /**
     * Construtor do botão que
     * Precisa receber uma imagem como parametro
    */
       
   private World link;
   
   //String image = "clicavel-PhotoRoom.png-PhotoRoom.png";  //Nome do arquivo como argumento
   public Retangulo1(String image, World link){
        
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
