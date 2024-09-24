// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LoserWorld extends World
{

    /**
     * Constructor for objects of class LoserWorld.
     * The size of the Background. 
     * The placement and size of the Text "Game Over :("
     */
    public LoserWorld()
    {
        super(560, 560, 1);
        showTextWithBigBlueFont("Game Over :(", 130, 200);
    }

    /**
     * This method shows a Blue Game Over Text once the Snake catches the Pig, when it's Game Over.
     */
    public void showTextWithBigBlueFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLUE);
        bg.drawString(message, x, y);
    }
}
