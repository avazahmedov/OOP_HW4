import java.util.Random;

public abstract class Warrior<T extends Weapon, V extends Shield>{
    private String name;

    protected T weapon;

    public V getProtect() {
        return protect;
    }

    public void setProtect(V protect) {
        this.protect = protect;
    }

    protected V protect;
    public T getWeapon() {
        return weapon;
    }

    public int healthPoint;
    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Warrior(String name, T weapon, V protect, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.protect = protect;
        this.healthPoint = healthPoint;
    }
 
    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, Shield: %s Health point: %d", name, weapon, protect, healthPoint);
    }

    public int hit(){
        Random random = new Random();
        return random.nextInt(weapon.damage()) ;
    }

    public int protectPoint(){
        Random random = new Random();
        return random.nextInt(protect.protection());
    }
}
