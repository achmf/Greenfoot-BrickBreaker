import greenfoot.*;

public class Block extends Actor {
    private int width;
    private int hitsRemaining; // Track remaining hits needed to break the block

    public Block(int width, int hitsNeeded) {
        this.width = width;
        this.hitsRemaining = hitsNeeded; // Initialize hits remaining
        updateColor(); // Update block color based on hits remaining
    }

    public void hit() {
        hitsRemaining--; // Decrease hits remaining when hit
        updateColor(); // Update block color based on hits remaining
        if (hitsRemaining <= 0) {
            getWorld().removeObject(this); // Remove the block if no hits remaining
        }
    }

    private void updateColor() {
    GreenfootImage image = getImage();
    if (hitsRemaining == 2) {
        image.setColor(Color.RED); // Set color to red if 2 hits remaining
    } else if (hitsRemaining == 1) {
        image.setColor(Color.ORANGE); // Set color to orange if 1 hit remaining
    }
    image.fill(); // Fill the image with the new color
    }

    public void act() {
        // Add block behavior here if needed
    }
}
