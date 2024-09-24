// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eat();
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-5);
        }
        if (isGameWon()) {
            transitionToWinnerWorld();
        }
    }

    /**
     * The eat() method allows the Pig to eat a Burger once it intersects with it and it disappears.
     */
    public void eat()
    {
        Actor Burger = getOneIntersectingObject(Burger.class);
        if (Burger != null) {
            World world = getWorld();
            world.removeObject(Burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * The isGameWon() method is an if statement. If  the Pig eats all the Burgers, the player wins the game. 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Once the player wins the game, the game transitions to a Winner Screen. 
     */
    public void transitionToWinnerWorld()
    {
        World winnerWorld =  new WinnerWorld();
        Greenfoot.setWorld(winnerWorld);
        Greenfoot.playSound("win.wav");
    }
}
