import greenfoot.*;  

public class TiroInimigo extends Tiros
{
    private World link;
    
    public TiroInimigo(){
        setImage(new GreenfootImage("BeamB_08.png")); // Set imagem recebida pelo parâmetro da função (adicionada ao Inicio)   
    }
    
    public void act()
    {
        move(3);
        abaterNave();
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    public void abaterNave(){
        if (isTouching(nave.class)){
            removeTouching(nave.class);
            Greenfoot.setWorld(new Fim());
        } 
           
      }
}