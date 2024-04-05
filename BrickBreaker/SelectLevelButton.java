import greenfoot.*;

public class SelectLevelButton extends Actor {
    public SelectLevelButton() {
        GreenfootImage image = new GreenfootImage("SELECT LEVEL", 24, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new SelectLevelMenu());
        }
    }
}
