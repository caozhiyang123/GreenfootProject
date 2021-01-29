import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private boolean init =false;
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        init();
        if(isTouching(Plane.class)){
            removeTouching(Plane.class);
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.endGame();
        }
    }
    
    private void init(){
        if(!init){
            setRotation(90);
            move(1);
        }
    }
}
