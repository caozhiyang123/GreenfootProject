import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(6);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
        if (Greenfoot.getRandomNumber(500) <30)
        {
            //Orange orange = new Orange();
            getWorld().addObject(new Orange(),getX(),getY());
        }
    }    
}
