import greenfoot.*;  

public class TiroPrincipal extends Tiros
{   
    public void act()
    {    
        move(-3);
        abaterInimigo();
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    public void abaterInimigo(){
        if (isTouching(Inimigo.class)){
            removeTouching(Inimigo.class);
            explosion ex = new explosion();
            getWorld().addObject(ex, this.getX(), this.getY());
            Counter contador = (Counter) getWorld().getObjects(Counter.class).get(0);
            contador.add(1);
        }
    }
        
        
    }

    
    

