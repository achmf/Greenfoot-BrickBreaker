import greenfoot.*;

public class Paddle extends Actor {
    private int width; // Width of the paddle

    public Paddle(int width) {
        this.width = width;
        GreenfootImage image = new GreenfootImage(width, 20); // Create paddle image with specified width
        image.setColor(Color.GREEN);
        image.fillRect(0, 0, width, 20); // Fill the paddle image with white color
        setImage(image); // Set the paddle image
    }

    public void act() {
        movePaddle();
    }

    private void movePaddle() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 6, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 6, getY());
        }
    }
}
