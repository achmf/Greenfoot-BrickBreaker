import greenfoot.*;

public class MainMenu extends World {
    static GreenfootSound gfs = new GreenfootSound("menu_bgs.mp3");
    public MainMenu() {
        super(800, 600, 1);
        setBackground("main-menu.png"); // Set the background image
        prepare();
        gfs.play();
    }

    private void prepare() {
        PlayButton playButton = new PlayButton();
        addObject(playButton, getWidth() / 2, getHeight() / 2);
        
        SelectLevelButton selectLevelButton = new SelectLevelButton();
        addObject(selectLevelButton, getWidth() / 2, getHeight() / 2 + 100);
    }
}
