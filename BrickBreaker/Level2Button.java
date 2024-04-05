import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2Button extends Actor
{
    public Level2Button() {
        GreenfootImage image = new GreenfootImage("LEVEL 2", 24, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level2World());
        }
    }
}
