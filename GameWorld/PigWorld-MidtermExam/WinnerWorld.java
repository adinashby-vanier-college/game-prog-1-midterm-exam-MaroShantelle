// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinnerWorld extends World
{

    /**
     * Constructor for objects of class WinnerWorld.
     * The size of the Background.
     * The placement and size of the Text "You Won !".
     */
    public WinnerWorld()
    {
        super(560, 560, 1);
        showTextWithBigPinkFont("You Won !", 170, 200);
    }

    /**
     * This method shows a Pink "You Won" Text once the Pig eats all the Burgers. When the player wins the Game.
     */
    public void showTextWithBigPinkFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.PINK);
        bg.drawString(message, x, y);
    }
}
