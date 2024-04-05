import greenfoot.*;

public class Level3World extends World {
    private int bricksPerRow = 15;
    private int rows = 5;
    private int brickWidth = 30;
    private int brickHeight = 20;
    private int horizontalPadding = 20;
    private int topPadding = 20;
    private int bottomPadding = 100;
    private BallLivesCounter livesCounter;
    static GreenfootSound gfs = new GreenfootSound("3background-music.mp3");

    public Level3World() {
        super(800, 600, 1);
        prepare();
        setBackground("lv3bg.png");
        gfs.setVolume(30);
        gfs.play();
        WinScreen2.gfs.stop();
        MainMenu.gfs.stop();
    }

    private void prepare() {
        int totalBrickWidth = bricksPerRow * brickWidth;
        int totalPaddingWidth = (bricksPerRow - 1) * horizontalPadding;
        int startX = (getWidth() - totalBrickWidth - totalPaddingWidth) / 2 + brickWidth / 2;

        // Assign Block Behaviour
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < bricksPerRow; j++) {
            Block brick = new ThreeHitBlock(brickWidth); // Use ThreeHitBlock for Level3
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
        ball.setXSpeed(7); // Set the horizontal speed to 5
        ball.setYSpeed(-7); // Set the vertical speed to -5
    }
    
    public boolean noBlocksRemaining() {
        return getObjects(Block.class).isEmpty();
    }

    public void act() {
        if (noBlocksRemaining()) {
            Greenfoot.setWorld(new WinScreen3()); // Transition to the win screen
        }
    }
}
