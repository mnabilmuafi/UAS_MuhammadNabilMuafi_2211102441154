import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    private static GreenfootSound music = new GreenfootSound("music.mp3");
    private boolean isMuted;
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            isMuted = ! isMuted;
            updateState();
        }
    }
    
    public void updateState()
    {
        if(isMuted)
        {
            setImage("Volume-Mute.png");
            music.pause();
        }
        else 
        {
            setImage("Volume-up.png");
            music.playLoop();
        }
    }
}
