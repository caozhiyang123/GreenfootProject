import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean init =false;
    private int count = 0;
    private Shield shield;
    
    public void act() 
    {
        // Add your action code here.
        init();
        
        if (Greenfoot.isKeyDown("up") ){
            move(2);
            //shield.moveUp(0,2,0);
        }
        else if (Greenfoot.isKeyDown("down") ){
            move(-2);
            //shield.moveUp(0,-2,0);
        }
        else if (Greenfoot.isKeyDown("right") ){
            turn(90);
            move(2);
            turn(-90);
            //shield.moveUp(90,2,-90);
        }
        else if (Greenfoot.isKeyDown("left") ){
            turn(-90);
            move(2);
            turn(90);    
            //shield.moveUp(-90,2,90);
        }
        
        count++;
        if(Greenfoot.isKeyDown("space") && (count%10==0 || count==1)){
           Rocket rocket =  new Rocket();
           getWorld().addObject(rocket,getX(),getY());
        }
        
    }    
    
    private void init(){
        if(!init){
            getImage().scale(50,50);
            this.setRotation(-90);
        }
        shield = new Shield();
        getWorld().addObject(shield,getX(),getY());
    }
}
