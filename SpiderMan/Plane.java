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
    private boolean removed = false;
    private int count = 0;
    public void act() 
    {
        count++;
        // Add your action code here.
        move(6);
        if(count%2==0){
            //getImage().mirrorHorizontally();
            this.setRotation(count);
        }
        
        if(isAtEdge()){
            getWorld().removeObject(this);
            removed = true;
        }
        
        if(removed){return;}
        
        if (Greenfoot.getRandomNumber(500) <30)
        {
            //Orange orange = new Orange();
            getWorld().addObject(new Orange(),getX(),getY());
        }
    }    
}
