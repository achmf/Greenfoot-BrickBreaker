import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level3Button extends Actor
{
    public Level3Button() {
        GreenfootImage image = new GreenfootImage("LEVEL 3", 24, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level3World());
        }
    }
}
