import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.World;

public class Point extends Score implements Scorable {
    private int scoreValue = 10; // Skor yang diberikan oleh objek Point

    public Point() {
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
    System.out.println("Point-specific behavior");
}

}
