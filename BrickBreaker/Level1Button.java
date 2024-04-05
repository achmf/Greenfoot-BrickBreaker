import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1Button extends Actor
{
    public Level1Button() {
        GreenfootImage image = new GreenfootImage("LEVEL 1", 24, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MainWorld());
        }
    }
}
