import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossKilled here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossKilled extends Actor
{
    private int second = 30;
    /**
     * Act - do whatever the BossKilled wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Enemy.class)){
            MyWorld myWorld = (MyWorld)getWorld();
            //myWorld.increaseScore(5);
            //myWorld.showScore();
            removeTouching(Enemy.class);
        }
        if(isTouching(Plane.class)){
            //removeTouching(Plane.class);
            //MyWorld myWorld = (MyWorld)getWorld();
            //myWorld.endGame();
        }
        // Add your action code here.
        second--;
        if(second<=0){
            getWorld().removeObject(this);
        }
    }    
}
