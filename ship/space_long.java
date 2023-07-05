import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


//Cabecalho da class
public class space_long extends World
{
    //Método construtor da classe space_long
    public space_long()
    {    
        
        // Crie um novo mundo com 1280x720 celulas de 1x1 pixels.
        super(1280, 720, 1); 
        prepare();      
    }
    
    private void prepare()
    {
        nave nave = new nave();
        Counter counter = new Counter();        
        addObject(nave ,540,650);
        addObject(counter ,1230,20);

    }
    
    public void act(){
        int aleatorio = Greenfoot.getRandomNumber(500); 
        if(aleatorio < 10){
            spawnal(); 
        }
        
    }
    
    public void spawnal(){
        // Caso o numero random acerte adicione um inimigo em um posição randomica no limite da tela
        if(Greenfoot.getRandomNumber(3) == 1){
            int x = Greenfoot.getRandomNumber(1200);
            addObject(new ranger2(), x, 1);
        }
    }
    
    
    }  
    
    
    

