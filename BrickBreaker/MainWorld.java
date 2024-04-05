import greenfoot.*;

public class MainWorld extends World {
    private int bricksPerRow = 10;
    private int rows = 3;
    private int brickWidth = 50;
    private int brickHeight = 20;
    private int horizontalPadding = 20;
    private int topPadding = 20;
    private int bottomPadding = 100;
    private BallLivesCounter livesCounter;
    static GreenfootSound gfs = new GreenfootSound("background-music.mp3");

    public MainWorld() {
        super(800, 600, 1);
        setBackground("lv1bg.png"); // Set the background image
        prepare();
        gfs.setVolume(30);
        gfs.play();
        MainMenu.gfs.stop();
    }

    private void prepare() {
        int totalBrickWidth = bricksPerRow * brickWidth;
        int totalPaddingWidth = (bricksPerRow - 1) * horizontalPadding;
        int startX = (getWidth() - totalBrickWidth - totalPaddingWidth) / 2 + brickWidth / 2;

        // Assign Block Behaviour
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < bricksPerRow; j++) {
            Block brick = new NormalBlock(brickWidth); // Use NormalBlock for Level1
            addObject(brick, startX + (j * (brickWidth + horizontalPadding)), topPadding + (i * (brickHeight + horizontalPadding)));
        }
        }

        Ball ball = new Ball(20); // Adjust ball size
        Paddle paddle = new Paddle(100); // Adjust paddle size
        addObject(ball, getWidth() / 2, getHeight() - bottomPadding);
        addObject(paddle, getWidth() / 2, getHeight() - 15);
        
        livesCounter = new BallLivesCounter(3); // Initialize BallLivesCounter with 3 lives
        addObject(livesCounter, getWidth() - 40, 580); // Add BallLivesCounter to the world
        ball.setLivesCounter(livesCounter); // Pass BallLivesCounter reference to the Ball object
        
        // Change the speed of the ball
        ball.setXSpeed(4); // Set the horizontal speed to 5
        ball.setYSpeed(-4); // Set the vertical speed to -5
    }
    
    public boolean noBlocksRemaining() {
        return getObjects(Block.class).isEmpty();
    }

    public void act() {
        if (noBlocksRemaining()) {
            Greenfoot.setWorld(new WinScreen()); // Transition to the win screen
        }
    }
}