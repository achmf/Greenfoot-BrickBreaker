import greenfoot.*;

public class BallLivesCounter extends Actor {
    private int lives;
    private String prefix;

    public BallLivesCounter(int initialLives) {
        this.lives = initialLives;
        this.prefix = "♥ ";
        updateImage();
    }

    public void loseLife() {
        lives--;
        updateImage();
    }

    public void gainLife() {
        lives++;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage(prefix + lives, 20, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }

    public int getLives() {
        return lives;
    }
}
