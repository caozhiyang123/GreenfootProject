import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orange extends Actor
{
    private int randomN = 0;
    /**
     * Act - do whatever the Orange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean removed = false;
    public void act() 
    {
        // Add your action code here.
        move(5);
        turn(1);
        getImage().scale(30,30);
        
        if(isAtEdge()){
            getWorld().removeObject(this);
            removed = true;
        }
        if(removed){return;}
        
        int y = getY();
        if(randomN == 0){
            while(randomN==0 || randomN < y){
                randomN = Greenfoot.getRandomNumber(360);
            }
        }
                
        if (getY()>=randomN){
            getWorld().addObject(new Explosion(),getX(),getY());
            getWorld().removeObject(this);
        }
    }    
}
