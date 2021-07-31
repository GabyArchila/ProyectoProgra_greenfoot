import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hamb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hamb extends Actor
{
    /**
     * Act - do whatever the Hamb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eatHamb(); //Es para que el actor accione con las instrucciones de abajo
    }
    
    private void eatHamb()//Es para indicar que se equivocó el jugador 
    { //Tambíen hace que el perro desaparezca al equivocarse
       Actor dogHamb = getOneIntersectingObject(dog1.class); 
       if(dogHamb!=null){
           getWorld().removeObject(dogHamb);
           setImage("smiley3.png"); //cambia la imagen de la hambuerguesa al ir por el camino equivocado
       }
    }
}
