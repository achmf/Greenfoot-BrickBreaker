import greenfoot.*;

public class NextLevelButton2 extends Actor {
    public NextLevelButton2() {
        GreenfootImage image = new GreenfootImage("next_level_button.png"); // Adjust image path
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level3World());
        }
    }
}
