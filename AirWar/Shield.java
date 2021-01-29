import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shield extends Actor
{
    /**
     * Act - do whatever the Shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count;
    public void act() 
    {
        // Add your action code here.
        count++;
        if(count==1){
            getWorld().removeObject(this);
        }
    }    
    
    public void moveUp(int direction1,int step,int direction2){
        turn(direction1);
        move(step);
        turn(direction2);
    }
}
