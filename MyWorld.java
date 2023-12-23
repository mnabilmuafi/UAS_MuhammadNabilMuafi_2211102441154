import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(150) < 3)
        {
            Point point = new Point();
            addObject(point, Greenfoot.getRandomNumber(1250), Greenfoot.getRandomNumber(625));
        }
        
        else if(Greenfoot.getRandomNumber(500) < 2)
        {
            Point2 point = new Point2();
            addObject(point, Greenfoot.getRandomNumber(1250), Greenfoot.getRandomNumber(625));
        }
        else if (Greenfoot.getRandomNumber(2000) < 3)
        {
            blue blue = new blue();
            addObject(blue, 0, 300);
        }
        else if (Greenfoot.getRandomNumber(2000) < 3)
        {
            blue blue = new blue();
            addObject(blue, 0, 510);
        }
        else if (Greenfoot.getRandomNumber(2000) < 3)
        {
            green green = new green();
            addObject(green, 0, 350);
        }
        
        else if (Greenfoot.getRandomNumber(2000) < 3)
        {
            green green = new green();
            addObject(green, 0, 550);
        }
        
        
        else if (Greenfoot.getRandomNumber(2000) < 3)
        {
            amb amb = new amb();
            addObject(amb, 0, 350);
        }
        
        else if (Greenfoot.getRandomNumber(2000) < 3)
        {
            amb amb = new amb();
            addObject(amb, 0, 510);
        }
        
    
        
        else if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        
    }
    
    private void prepare()
    {
        Car car = new Car();
        addObject(car, 150, 350);
        Music music = new Music();
        addObject(music, 10, 612);
        music.setLocation(1050, 550);
        music.setLocation(1050, 550);
    }
}
