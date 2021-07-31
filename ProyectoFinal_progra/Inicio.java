import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{
    GreenfootSound myMusic1 = new GreenfootSound("game.mp3"); //Se agrega la música al juego
    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Es el tamaño de la pantalla del juego
        super(590, 590, 1); 
    }
    
    public void act()
    {
        //Es para que al dar "click" inicie el juego. 
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Fondo());
        myMusic1.play(); //Es la acción para reproducir música 
    }
}
