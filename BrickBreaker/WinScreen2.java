import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen2 extends World
{
    static GreenfootSound gfs = new GreenfootSound("win_sound.mp3");
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen2()
    {    
        super(800, 600, 1);
        Level2World.gfs.stop();
        gfs.play();
        setBackground("win_screen.png");
        addObject(new NextLevelButton2(), getWidth() / 2, getHeight() - 100);
    }
}
