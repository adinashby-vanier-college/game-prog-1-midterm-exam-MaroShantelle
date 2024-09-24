// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new Burger();
        addObject(burger, 101, 92);
        Burger burger2 =  new Burger();
        addObject(burger2, 450, 241);
        Burger burger3 =  new Burger();
        addObject(burger3, 135, 278);
        Burger burger4 =  new Burger();
        addObject(burger4, 406, 92);
        burger2.setLocation(528, 238);
        burger3.setLocation(86, 317);
        Burger burger5 =  new Burger();
        addObject(burger5, 309, 268);
        burger4.setLocation(418, 58);
        burger5.setLocation(314, 311);
        burger5.setLocation(309, 219);
        burger2.setLocation(535, 300);
        burger.setLocation(77, 86);
        burger5.setLocation(265, 251);
        burger3.setLocation(81, 318);
        burger4.setLocation(298, 80);
        burger5.setLocation(426, 266);
        Pig pig =  new Pig();
        addObject(pig, 299, 195);
        Snake snake =  new Snake();
        addObject(snake, 542, 35);
        snake.setLocation(45, 39);
        burger.setLocation(81, 163);
        burger4.setLocation(256, 83);
        burger5.setLocation(486, 158);
        Burger burger6 =  new Burger();
        addObject(burger6, 358, 314);
        Burger burger7 =  new Burger();
        addObject(burger7, 508, 60);
        burger5.setLocation(494, 190);
        burger4.setLocation(293, 52);
        burger6.setLocation(307, 305);
        burger.setLocation(163, 143);
        burger5.setLocation(486, 211);
        burger3.setLocation(124, 251);
        Burger burger8 =  new Burger();
        addObject(burger8, 46, 358);
        burger.setLocation(96, 121);
        Burger burger9 =  new Burger();
        addObject(burger9, 407, 337);
        burger5.setLocation(427, 131);
        burger9.setLocation(460, 394);
        burger2.setLocation(518, 242);
        burger9.setLocation(457, 335);
        Burger burger10 =  new Burger();
        addObject(burger10, 184, 336);
        burger6.setLocation(348, 275);
        burger9.setLocation(565, 357);
        burger3.setLocation(138, 201);
        burger.setLocation(63, 120);
        burger3.setLocation(114, 225);
    }
}
