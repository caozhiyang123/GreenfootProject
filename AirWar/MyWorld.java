import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private boolean killedBoss;
    public void setKilledBoss(boolean killedBoss){this.killedBoss = killedBoss;}
    private int score;
    public void increaseScore(int score){this.score += score;}
    public int getScore(){return this.score;}
    private String lifeCode = "|";
    private String[] lifeBar = new String[100];
    private int lastLife;    
    public int getLife(){return lastLife;}
    
    public void resetLifeBar(int k){
        synchronized(lifeBar){
            int size = lastLife--;
            if(k<0 && size>=0){
                for(int i=0;i<lifeBar.length;i++){
                  lifeBar[i]="";
                }
                for(int i=0;i<size;i++){
                    lifeBar[i]=lifeCode;
                }
            }
        }
    }
    
    private Boss boss;
    //public Boss getBoss(){return boss;}
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        init();
    }
    
    private void init(){
        Plane plane = new Plane();
        addObject(plane,55,320);
        showScore();
        initLifeBar();
    }
    
    private void showScore(){
        showText("score: "+this.score,550,25);
    }
    
    private void initLifeBar(){
        lastLife = lifeBar.length;
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<lifeBar.length;i++){
            lifeBar[i]=lifeCode;
            sb.append(lifeCode);
            if(i==50){sb.append("\r\n");}
        }
        showText(sb.toString(),150,25);
    }
    
    private void showLifeBar(){
        if(lifeBar==null){return;}
        synchronized(lifeBar){
            StringBuffer sb = new StringBuffer();
            for(int i =0;i<lifeBar.length;i++){
                sb.append(lifeBar[i]);
                if(i==50){sb.append("\r\n");}
            }
            showText(sb.toString(),150,25);
        }
    }
    
    @Override
    public void act()
    {        
        if(this.boss != null && this.killedBoss){
            this.killedBoss = false;
            this.boss = null;
        }
        
        //showText("score%50="+score%50+",killedBoss:"+killedBoss+",this.boss="+this.boss,30,170); 
        if(this.boss == null){
            synchronized(MyWorld.class){
               if(score>0 && score%30==0 && !killedBoss && this.boss == null){
                    this.boss = new Boss();
                    addObject(boss, 400, 100);
                    return;
               } 
            }
        }
        
        if (this.boss == null && Greenfoot.getRandomNumber(500) <30)
        {
            addObject(new Enemy(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(100));
        }
        showScore();       
        showLifeBar();
    }
    
    public void endGame(){
        showText("Game Over!!!",290,150);
        showText("Your Final Score is: "+this.score,270,170);
    }
}
