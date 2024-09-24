// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameOver()) {
            transitionToLoserWorld();
        }
    }

    /**
     * The moveAround() method allows the snake to move randomly around the world.
     */
    public void moveAround()
    {
        move(2);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * The eat() method allows the Snake to catch the Pig once it intersects with it and the Pig disappears. 
     */
    public void eat()
    {
        Actor Pig = getOneIntersectingObject(Pig.class);
        if (Pig != null) {
            World world = getWorld();
            world.removeObject(Pig);
        }
    }

    /**
     * The isGamever() method is an if statement. If the Snake catches the Pig it's Game Over. 
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Once the player loses the game, the game transitions to a Game Over Screen. 
     */
    public void transitionToLoserWorld()
    {
        World loserWorld =  new LoserWorld();
        Greenfoot.setWorld(loserWorld);
        Greenfoot.playSound("lose.wav");
    }
}
