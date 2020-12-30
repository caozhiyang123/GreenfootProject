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
    public void act() 
    {
        // Add your action code here.
        init();
        
        if (Greenfoot.isKeyDown("up") ){
            move(2);
        }
        else if (Greenfoot.isKeyDown("down") ){
            move(-2);
        }
        else if (Greenfoot.isKeyDown("right") ){
            turn(90);
            move(2);
            turn(-90);
        }
        else if (Greenfoot.isKeyDown("left") ){
            turn(-90);
            move(2);
            turn(90);    
        }
        
        if(Greenfoot.isKeyDown("space")){
           Rocket rocket =  new Rocket();
           getWorld().addObject(rocket,getX(),getY());
        }
        
    }    
    
    private void init(){
        getImage().scale(100,100);
        this.setRotation(-90);
    }
}
