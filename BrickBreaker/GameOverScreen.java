import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World {
    static GreenfootSound gfs = new GreenfootSound("game_over_bgs.mp3");
    public GameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground("game-over.png"); // Set the background image
        MainWorld.gfs.stop();
        Level2World.gfs.stop();
        Level3World.gfs.stop();
        gfs.play();
    }
}
