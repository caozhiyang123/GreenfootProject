import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        init();
        
        if (Greenfoot.getRandomNumber(500) <50)
        {
            up();
        }
        
        if (Greenfoot.getRandomNumber(500) <40)
        {
            down();
        }
        
        if (Greenfoot.getRandomNumber(500) <30)
        {
            turnLeft();
        }
        
        if (Greenfoot.getRandomNumber(500) <20)
        {
            turnRight();
        }
    }    
    
    private void init(){
        getImage().scale(80,80);
        this.setRotation(-180);
    }
    
    private void up(){
        move(2);
    }
    
    private void down(){
        move(-1);
    }
    
    private void turnLeft(){
        turn(90);
        move(2);
        turn(-90);
    }
    
    private void turnRight(){
        turn(-90);
        move(2);
        turn(90);
    }
}
