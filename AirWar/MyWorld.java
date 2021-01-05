import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        init();
    }
    
    private void init(){
        Plane plane = new Plane();
        addObject(plane,250,300);
    }
    
    @Override
    public void act()
    {
        if (Greenfoot.getRandomNumber(500) <30)
        {
            addObject(new Enemy(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(100));
        }
    }
}
