import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    private int second = 100;
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        second--;
        if(second<=0){
            getWorld().addObject(new Explosion(),getX(),getY());
            Greenfoot.playSound("ExplosionSound.wav");
            Lizard.existingBomb = null;
            getWorld().removeObject(this);
        }    
    }    
}
