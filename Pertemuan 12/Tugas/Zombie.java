package Tugas;

public class Zombie implements Destroyable{
    protected int health, level;

    public void heal(){

    }
    public void destroyed(){

    }
    public String getZombieInfo(){
        return "Health = "+health+"\n"+"Level = "+level;
    }
}
