import greenfoot.*;  


public class nave extends Actor
{   
    public nave(){
        setImage(new GreenfootImage("ShipColorful_0005_Package-----------------.png")); // Set imagem recebida pelo parâmetro da função (adicionada ao Inicio)
    }
    
    public void act()
        { 
        if (Greenfoot.isKeyDown("left"))
            {
             move(-6);   
            }
        if (Greenfoot.isKeyDown("right"))
        {
            move(6);
        }
        if ("space".equals(Greenfoot.getKey())){           
            atirar();       
        }
        
        
        }
    
    private void atirar(){
        TiroPrincipal tiro = new TiroPrincipal();
        getWorld().addObject(tiro, this.getX(), this.getY());
        tiro.setRotation(90);
    }
}
