import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(400, 600, 1);
        setBackground("bg.png");
        prepare();
        sound();
    }
    
    private void prepare()
    {
        Hero hero = new Hero();
        Alien alien = new Alien();
        Boss boss = new Boss();
        
        addObject(hero, 200, 500);
        for (int i = 0; i < 5; i++) {
            addObject(alien, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(300));
        }
        addObject(boss, 100, 200);    
    }
    public void sound()
    {
        GreenfootSound bs = new GreenfootSound("bg0.wav");
        bs.playLoop();
    }
}