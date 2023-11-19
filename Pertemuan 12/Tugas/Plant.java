package Tugas;

public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof WalkingZombie){
            WalkingZombie wz = (WalkingZombie) d;
            wz.health -= Math.floor(wz.health*0.2);
        } else if(d instanceof JumpingZombie){
            JumpingZombie jz = (JumpingZombie) d;
            jz.health -= Math.floor(jz.health*0.1);
        } else if(d instanceof Barrier){
            Barrier b = (Barrier) d;
            int strength = b.getStrength();
            strength -= 9;
            b.setStrength(strength);
        }
    }
}
