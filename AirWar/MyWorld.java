import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score;
    public void increaseScore(int score){this.score += score;}
    public int getScore(){return this.score;}
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        init();
    }
    
    private void init(){
        Plane plane = new Plane();
        addObject(plane,55,320);
        showScore();
    }
    
    public void showScore(){
        showText("score: "+this.score,550,25);
    }
    
    @Override
    public void act()
    {
        if (Greenfoot.getRandomNumber(500) <30)
        {
            addObject(new Enemy(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(100));
        }
        showScore();
    }
    
    public void endGame(){
        showText("Game Over!!!",290,150);
        showText("Your Final Score is: "+this.score,270,170);
    }
}
