import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen3 extends World
{
    static GreenfootSound gfs = new GreenfootSound("win_sound.mp3");
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen3()
    {    
        super(800, 600, 1);
        Level3World.gfs.stop();
        gfs.play();
        setBackground("win_screen.png");
    }
}
