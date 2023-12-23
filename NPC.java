import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC extends Actor
{
    /**
     * Act - do whatever the NPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }

    public void crash() {
        if (isTouching(Car.class)) {
            handleCarCrash();
        } else if (isTouching(NPC.class)) {
            handleNPCCrash();
        } 
        else if (isTouching(Score.class)) {
            handleScoreCrash();
        }

        else if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }

    private void handleCarCrash() {
        getWorld().showText("You Crashed!!", 550, 300);
        getWorld().showText("Press Enter to try again", 550, 350);
        Greenfoot.playSound("crash.wav");
        removeTouching(Car.class);
    }

    private void handleNPCCrash() {
        // Logika penghapusan objek NPC saat menabrak objek NPC lainnya
        getWorld().removeObject(this);
    }

    private void handleScoreCrash() {
        // Logika penghapusan objek Score saat menabrak objek NPC
        getWorld().removeObject(getOneIntersectingObject(Score.class));
    }

    public void crash(Actor otherActor) {
        if (isTouching(otherActor.getClass())) {
            removeTouching(otherActor.getClass());
        }
    }
}
