import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee_world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee_world extends World
{

    /**
     * Constructor for objects of class bee_world.
     * 
     */
    public bee_world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Bee Bee = new Bee();
        addObject(Bee, 224, 176);
        bunga bunga = new bunga ();
        addObject(bunga, 532, 68);
        bunga bunga2 = new bunga ();
        addObject(bunga2, 530, 352);
        bunga bunga3 = new bunga ();
        addObject(bunga3, 69, 54);
        bunga bunga4 = new bunga ();
        addObject(bunga4, 85, 342);
        jamur jamur = new jamur();
        addObject(jamur, 537, 212);
        jamur jamur2 = new jamur();
        addObject(jamur2, 92, 205);
        jamur jamur3 = new jamur();
        addObject(jamur3, 314, 353);
        jamur jamur4 = new jamur();
        addObject(jamur4, 316, 56);
    }
}
