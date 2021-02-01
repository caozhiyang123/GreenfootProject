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
    //public void increaseCount(int v){this.count+=v;}
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        init();
        ((MyWorld)getWorld()).showText("count="+this.count,30,170); 
        if(isTouching(Rocket.class)){
          count++;
        }
        if(count>=1000){
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.setKilledBoss(true);
            myWorld.increaseScore(10);
            getWorld().removeObject(this);
            return;
        }
        
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
    
    private void up(){
        move(1);
    }
    
    private void down(){
        move(-1);
    }
    
    private void turnLeft(){
        turn(90);
        move(1);
        turn(-90);
    }
    
    private void turnRight(){
        turn(-90);
        move(1);
        turn(90);
    }
    
    private void init(){
        if(!init){
            getImage().scale(100,100);
            this.setRotation(180);
        }
    }
}
