import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(400, 600, 1);
        setBackground("bg.png");
        prepare();
    }
    
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero, 200, 500);
        
        for (int i = 0; i < 5; i++) {
            Alien alien = new Alien();
            addObject(alien, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(300));
        }
        
        Boss boss = new Boss();
        
        addObject(boss, 100, 200);
    }
}