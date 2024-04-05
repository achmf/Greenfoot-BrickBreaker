import greenfoot.*;

public class SelectLevelMenu extends World {
    public SelectLevelMenu() {
        super(800, 600, 1);
        setBackground("select-level.png"); // Set the background image
        prepare();
    }

    private void prepare() {
        Level1Button level1Button = new Level1Button();
        addObject(level1Button, getWidth() / 2, getHeight() / 2 - 50);

        Level2Button level2Button = new Level2Button();
        addObject(level2Button, getWidth() / 2, getHeight() / 2);

        Level3Button level3Button = new Level3Button();
        addObject(level3Button, getWidth() / 2, getHeight() / 2 + 50);
    }
}
