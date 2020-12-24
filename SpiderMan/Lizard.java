import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lizard extends Actor
{
    public static Bomb existingBomb = null;
    /**
     * Act - do whatever the Lizard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() 
    {
        // Add your action code here.
        // Add your action code here.
        if (Greenfoot.isKeyDown("up") ){
            move(2);
        }
        if (Greenfoot.isKeyDown("down") ){
            move(-2);
        }
        if (Greenfoot.isKeyDown("right") ){
            turn(4);
        }
        if (Greenfoot.isKeyDown("left") ){
            turn(-4);    
        }
        
        eatBanana();
        
        if(Greenfoot.isKeyDown("b")){
            if(existingBomb == null){
                //Bomb bomb = new Bomb();
                existingBomb = new Bomb();
                getWorld().addObject(existingBomb,getX(),getY());
            }
        }
        if(Greenfoot.isKeyDown("r")){
            Rocket rocket = new Rocket();
            getWorld().addObject(rocket,getX(),getY());
        }
            
    }
    
    private void eatBanana(){
        if(isTouching(Bnana.class)){
            removeTouching(Bnana.class);
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.increaseScore(1);
            myWorld.showScore();
            
            Greenfoot.playSound("EatingBanana.wav");
        }
    }
}
