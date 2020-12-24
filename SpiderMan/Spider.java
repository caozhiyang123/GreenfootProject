import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        move(1);
        if(isAtEdge()){
            turn(45);
        }
        if(isTouching(Lizard.class)){
            removeTouching(Lizard.class);
            Greenfoot.playSound("Eating.wav");
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.gameOver = true;
            myWorld.endGame();
        }
    }    
}
