import greenfoot.*; 
public class Inicio extends World
{

    /**
     * Construtor da tela de inicio
     */
    
    public Inicio()
    {    
        super(1280, 720, 1);
        prepare();
        
    }
    
    private void prepare() {
        // Instanciando objetos da tela de inicio

        
        LetrasGlitch letrasglitch = new LetrasGlitch();
        Retangulo1 retangulo1 = new Retangulo1("clicavel-PhotoRoom.png-PhotoRoom.png", new space_long());
        letrasGlitch2 letrasglitch2 = new letrasGlitch2();

        // Adicionando objetos a cena
        
        addObject(letrasglitch2, 640, 360);
        addObject(retangulo1, 643,508);
        addObject(letrasglitch, 640, 360);
        

        
    }
}
