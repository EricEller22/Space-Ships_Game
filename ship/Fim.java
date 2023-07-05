import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Fim extends World
{   
    public Fim()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
        
    }

    private void prepare(){
        // Instanciando objetos da tela de inicio

        GameOver gameover = new GameOver();
        Retangulo2 retangulo2 = new Retangulo2("jogarnovamente.png", new space_long());
        
        // Adicionando objetos a cena
        
        addObject(gameover, 640, 360);
        addObject(retangulo2, 643,508);
    }
}
