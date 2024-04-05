import greenfoot.*;

public class Ball extends Actor {
    private int diameter; // Diameter of the ball
    private int xSpeed = 0; // Initial speed set to 0
    private int ySpeed = 0; // Initial speed set to 0
    private BallLivesCounter livesCounter;
    private boolean gameStarted = false; // Variable to track whether the game has started

    public Ball(int diameter) {
        this.diameter = diameter;
        GreenfootImage image = new GreenfootImage(diameter, diameter); // Create ball image with specified diameter
        image.setColor(new Color(255, 255, 0));
        image.fillOval(0, 0, diameter, diameter); // Fill the ball image with a blue circle
        setImage(image); // Set the ball image
    }

    public void act() {
        if (!gameStarted) {
            checkStartGame(); // Check for SPACEBAR input to start the game
        } else {
            move();
            checkCollision();
        }
    }

    private void move() {
        setLocation(getX() - xSpeed, getY() - ySpeed);
    }

    private void checkCollision() {
        if (getX() <= 0 || getX() >= getWorld().getWidth() - diameter) {
            xSpeed = -xSpeed; // Reverse horizontal direction if hits side walls
        }
        if (getY() <= 0) {
            ySpeed = -ySpeed; // Reverse vertical direction if hits top wall
        }
        if (getY() >= getWorld().getHeight() - diameter) {
            livesCounter.loseLife(); // Lose a life if hits bottom wall
            if (livesCounter.getLives() > 0) {
                setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2); // Reset ball position
            } else {
                Greenfoot.setWorld(new GameOverScreen()); // Show game over screen if no lives left
            }
        }
        
        Actor paddle = getOneIntersectingObject(Paddle.class);
        if (paddle != null) {
            ySpeed = -ySpeed; // Reverse vertical direction if hits the paddle
            Greenfoot.playSound("ball-paddle.mp3");
        }
        
        Actor block = getOneIntersectingObject(Block.class);
            if (block != null) {
                // Decrease hit count of the block
                ((Block) block).hit();
                ySpeed = -ySpeed; // Reverse vertical direction if hits a block
                Greenfoot.playSound("break.mp3");
        }
    }
    
    public void setLivesCounter(BallLivesCounter livesCounter) {
        this.livesCounter = livesCounter;
    }
    
    // Setter methods for xSpeed and ySpeed
    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    private void checkStartGame() {
        if (Greenfoot.isKeyDown("space")) {
            gameStarted = true; // Update game state to started
        }
    }
}
