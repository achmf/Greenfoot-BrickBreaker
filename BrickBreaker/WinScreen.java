import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{
    static GreenfootSound gfs = new GreenfootSound("win_sound.mp3");
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        super(800, 600, 1);
        MainWorld.gfs.stop();
        gfs.play();
        setBackground("win_screen.png");
        addObject(new NextLevelButton(), getWidth() / 2, getHeight() - 100);
    }
}
