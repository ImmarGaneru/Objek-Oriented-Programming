package Tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal(){
        if (level == 1){
            health += 0.3*health;
        } else if (level == 2){
            health += 0.4*health;
        } else if (level == 3){
            health += 0.5*health;
        }
    }
    public void destroyed(){
        health -= 0.1*health;
    }
    public String getZombieInfo(){
        return "Jumping Zombie Data =\n"+super.getZombieInfo()+"\n";
    }
}
