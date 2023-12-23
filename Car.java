import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.World;

public class Car extends Actor {
    private int speed = 0;
    private int score = 0;

    public void act() {
        move(5);
        handleControls();
        checkCollision();
        checkEdge();
    }

    private void handleControls() {
        if (Greenfoot.isKeyDown("a")) {
            turn(-5);
        }

        if (Greenfoot.isKeyDown("d")) {
            turn(5);
        }

        if (Greenfoot.isKeyDown("s")) {
            move(-10);
        }

        if (Greenfoot.isKeyDown("w")) {
            move(5);
        }
    }

    private void checkCollision() {
    if (isTouching(Point.class)) {
        // Hapus objek Point
        removeTouching(Point.class);

        // Lakukan tindakan tambahan jika diperlukan
        Greenfoot.playSound("sound.wav");
        score += 10; // Misalnya, tambahkan skor setiap kali menabrak Point
        getWorld().showText("Score: " + score, 625, 20);
    }

    else if (isTouching(Point2.class)) {
        // Hapus objek Point2
        removeTouching(Point2.class);

        // Lakukan tindakan tambahan jika diperlukan
        Greenfoot.playSound("sound.wav");
        score += 30; // Misalnya, tambahkan skor setiap kali menabrak Point2
        getWorld().showText("Score: " + score, 625, 20);
    }
}


    private void checkEdge() {
        if (isAtEdge()) {
            Greenfoot.playSound("crash.wav");
            getWorld().showText("You Crashed!", 550, 300);
            getWorld().showText("Press Enter to try again!", 550, 350);
            getWorld().removeObject(this);
        }
    }
}
