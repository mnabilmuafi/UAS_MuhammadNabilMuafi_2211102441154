import greenfoot.Greenfoot;
import greenfoot.Actor;

import greenfoot.Actor;

public class Score extends Actor implements Scorable {
    private static int score = 0;

    public Score() {
        // Konstruktor
    }

    public void act() {
        // Implementasi act (jika diperlukan)
    }

    private static void increaseScore(int value) {
        score += value;
    }

    public static int getScore() {
        return score;
    }

    public static void increaseScoreFromScorable(int value) {
        increaseScore(value);
    }

    public void giveScore() {
        Greenfoot.playSound("sound.wav");
        increaseScoreFromScorable(5);
        getWorld().showText("Score: " + getScore(), 625, 20);
        getWorld().removeObject(this);
        System.out.println("Default Score behavior");
    }
}
