import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int count = 0;
    private boolean init =false;
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
            //down();
        }
        
        if (Greenfoot.getRandomNumber(500) <30)
        {
            turnLeft();
        }
        
        if (Greenfoot.getRandomNumber(500) <20)
        {
            turnRight();
        }
        
        if(isTouching(Plane.class)){
            removeTouching(Plane.class);
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.endGame();
            return;
        }
        
        count++;
        if((count%40==0 || count==1)){
           Bullet bullet =  new Bullet();
           getWorld().addObject(bullet,getX(),getY());
        }
        
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
    
    private void init(){
        if(!init){
            getImage().scale(80,80);
            this.setRotation(90);
        }
    }
    
    private void up(){
        move(3);
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
}
