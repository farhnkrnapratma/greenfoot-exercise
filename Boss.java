import greenfoot.*;

public class Boss extends Enemy
{
    public Boss(){
        super(5);
    }
    public void act()
    {
        super.act();
        turn(3);
    }
}
