import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    private GreenfootSound theme = new GreenfootSound("music.mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            theme.stop();
            Greenfoot.setWorld(new MyWorld());
        }
        else if (Greenfoot.isKeyDown("m"))
        {
            theme.stop();
            Greenfoot.setWorld(new Tutorials());
        }
    }
    
    private void prepare()
    {
        Title title = new Title();
        addObject(title, 645, 180);
        title.setLocation(624,312);
        Title title2 = new Title();
        addObject(title2,624,312);
        Title title3 = new Title();
        addObject(title3,626,314);
    }
}
