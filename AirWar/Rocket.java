import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private boolean init =false;
    private boolean removed = false;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        init();
        if(!removed && isTouching(Boss.class)){
            //MyWorld myWorld = (MyWorld)getWorld();
            //myWorld.getBoss().increaseCount(1);
            return;
        }
        
        if(!removed && isTouching(Enemy.class)){
            //increase score
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.increaseScore(1);
            
            getWorld().addObject(new BossKilled(),getX(),getY());
            //Greenfoot.playSound("ExplosionSound.wav");
            getWorld().removeObject(this);
            removed = true;
        }
        if(!removed && isAtEdge()){
            getWorld().removeObject(this);
            removed = true;
        }
    }
    
    private void init(){
        if(!init){
            getImage().scale(40,30);
            setRotation(-90);
            move(3);
        }
    }
}
