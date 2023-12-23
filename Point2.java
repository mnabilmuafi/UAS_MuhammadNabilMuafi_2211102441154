import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.World;

public class Point2 extends Score implements Scorable {
    private int scoreValue = 30; // Skor yang diberikan oleh objek Point2

    public Point2() {
        // Konstruktor
    }

    public void act() {
        // Implementasi act (jika diperlukan)
    }

    public void giveScore() {
    Greenfoot.playSound("sound.wav");
    Score.increaseScoreFromScorable(scoreValue);
    getWorld().showText("Score: " + Score.getScore(), 625, 20);
    getWorld().removeObject(this);
    System.out.println("Point2-specific behavior");
    }


}
