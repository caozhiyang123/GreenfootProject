import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int second = 40;
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isTouching(Spider.class)){
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.increaseScore(5);
            myWorld.showScore();
            removeTouching(Spider.class);
        }
        if(isTouching(Lizard.class)){
            removeTouching(Lizard.class);
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.endGame();
        }
        second--;
        if(second<=0){
            getWorld().removeObject(this);
        }
    }    
}
