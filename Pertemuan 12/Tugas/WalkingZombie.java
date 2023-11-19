package Tugas;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal(){
        if (level == 1){
            health += 0.1*health;
        } else if (level == 2){
            health += 0.3*health;
        } else if (level == 3){
            health += 0.4*health;
        }
    }
    public void destroyed(){
        health -= 0.2*health;
    }
    public String getZombieInfo(){
        return "Walking Zombie Data =\n"+super.getZombieInfo()+"\n";
    }
}
