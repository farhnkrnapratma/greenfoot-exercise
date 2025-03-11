import greenfoot.*;

public class Enemy extends Actor
{
    int tipe;
    int hp;
    
    public Enemy(){
        tipe = 1;
        setImage("Alien"+tipe+".png");
    }
    public Enemy(int tipe){
        this.tipe = tipe;
        this.hp = tipe+1;
        setImage("Alien"+tipe+".png");
    }
}