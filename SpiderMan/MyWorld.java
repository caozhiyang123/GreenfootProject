import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static boolean gameOver = false;
    private int score;
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
        Spider spider = new Spider();
        addObject(spider,100,358);
        Lizard lizard = new Lizard();
        addObject(lizard,224,189);
        Rock rock = new Rock();
        addObject(rock,30,30);
        showScore();
    }
    
    public void showScore(){
        showText("score: "+this.score,550,25);
    }
    
    public void increaseScore(int score){
        if(!gameOver){
            this.score += score;
        }
    }
    
    @Override
    public void act()
    {
        if (Greenfoot.getRandomNumber(500) <3)
        {
            addObject(new Bnana(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(700)<5){
            addObject(new Spider(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(500)<3){
            Plane plane = new Plane();
            addObject(plane, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(360));
        }
    }
    
    public void endGame(){
        this.gameOver = true;
        showText("Game Over!!!",290,150);
        showText("Your Final Score is: "+this.score,270,170);
    }
}
