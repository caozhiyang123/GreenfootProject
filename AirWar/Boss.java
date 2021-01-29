import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    private boolean init =false;
    private int count;
    public void increaseCount(int v){this.count+=v;}
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        init();
        if(isTouching(Rocket.class)){
            count++;
            
        }
        if(count>=30){
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.setKilledBoss(true);
            myWorld.increaseScore(10);
            getWorld().removeObject(this);
        }
    }    
    
    private void init(){
        if(!init){
            getImage().scale(100,100);
            this.setRotation(180);
        }
    }
}
