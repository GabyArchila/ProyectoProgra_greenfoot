import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dog1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog1 extends Actor
{
    GreenfootSound masticar1 = new GreenfootSound("masticar.mp3"); //se agrega sonido de masticar
    /**
     * Act - do whatever the dog1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add
        move(2); // es para el movimiento y su rapidez 
        if(Greenfoot.isKeyDown("left")) // para controlar al acto con las flechas del teclado
        turn(-5);
        if(Greenfoot.isKeyDown("right"))
        turn(5); 
        
        eatPizza(); //la acción de comer pizza
    }
    
    private void eatPizza() //El perro al tocar las pizzas son comidas y muestra que es la opción correcta
    {
        if(isTouching(Pizza.class))
        removeTouching(Pizza.class);
        masticar1.play();
    }
}
