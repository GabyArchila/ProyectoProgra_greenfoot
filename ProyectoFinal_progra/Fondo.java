import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo extends World
{
    GreenfootSound myMusic = new GreenfootSound("game.mp3"); //se agrego música de fondo al juego 
    /**
     * Constructor for objects of class Fondo.
     * 
     */
    public Fondo()
    {    
        // el tamaño de la pantalla del juego 
        super(960, 540, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Son los actores del juego en el mundo 
        dog1 dog1 = new dog1();
        addObject(dog1,285,322);
        dog1.setLocation(283,321);
        dog1.setLocation(464,459);
        Pizza pizza = new Pizza();
        addObject(pizza,639,447);
        pizza.setLocation(628,474);
        pizza.setLocation(610,473);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,625,368);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,697,322);
        pizza2.setLocation(663,408);
        pizza.setLocation(582,483);
        pizza2.setLocation(660,412);
        pizza3.setLocation(611,347);
        pizza3.setLocation(696,273);
        pizza3.setLocation(929,241);
        pizza2.setLocation(747,227);
        pizza.setLocation(713,328);
        pizza3.setLocation(832,282);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,618,337);
        pizza.setLocation(736,322);
        pizza4.setLocation(625,308);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,664,413);
        Pizza pizza6 = new Pizza();
        addObject(pizza6,167,245);
        Pizza pizza7 = new Pizza();
        addObject(pizza7,262,287);
        Pizza pizza8 = new Pizza();
        addObject(pizza8,167,353);
        Pizza pizza9 = new Pizza();
        addObject(pizza9,265,377);
        removeObject(pizza9);
        removeObject(pizza7);
        removeObject(pizza8);
        removeObject(pizza6);
        Hamb hamb = new Hamb();
        addObject(hamb,220,218);
        Hamb hamb2 = new Hamb();
        addObject(hamb2,175,283);
        Hamb hamb3 = new Hamb();
        addObject(hamb3,265,325);
        Hamb hamb4 = new Hamb();
        addObject(hamb4,171,389);
        dog1.setLocation(456,431);
        dog1.setLocation(463,438);
        pizza5.setLocation(704,403);
        pizza.setLocation(726,291);
        pizza3.setLocation(839,284);
        pizza2.setLocation(764,223);
        pizza.setLocation(748,277);
        pizza4.setLocation(649,289);
        pizza5.setLocation(715,349);
        hamb.setLocation(226,229);
        hamb2.setLocation(157,244);
        hamb3.setLocation(262,276);
        hamb4.setLocation(191,317);
        hamb3.setLocation(271,327);
        hamb.setLocation(224,248);
        hamb.setLocation(242,251);
        pizza2.setLocation(800,195);
        pizza3.setLocation(835,297);
        pizza.setLocation(758,269);
        pizza4.setLocation(666,260);
        pizza5.setLocation(753,323);
    }

    public void act ()
    {
        myMusic.play(); //Es la acción de reproducir música 
    }
}
