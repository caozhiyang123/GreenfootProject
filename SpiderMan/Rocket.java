import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private boolean removed = false;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        turn(1);
        move(1);
        getImage().scale(30,10);
        
        if(!removed && isTouching(Spider.class)){
            getWorld().addObject(new Explosion(),getX(),getY());
            Greenfoot.playSound("ExplosionSound.wav");
            getWorld().removeObject(this);
            removed = true;
        }
        if(!removed && isAtEdge()){
            getWorld().removeObject(this);
            removed = true;
        }
    }    
}
