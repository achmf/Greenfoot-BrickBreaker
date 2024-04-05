import greenfoot.*;

public class NextLevelButton extends Actor {
    public NextLevelButton() {
        GreenfootImage image = new GreenfootImage("next_level_button.png"); // Adjust image path
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level2World());
        }
    }
}