import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorials here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorials extends World
{

    /**
     * Constructor for objects of class Tutorials.
     * 
     */
    public Tutorials()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
    private void prepare()
    {
        Controls controls = new Controls();
        addObject(controls, 565, 319);
        controls.setLocation(625, 312);
    }
}
