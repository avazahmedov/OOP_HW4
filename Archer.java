import java.util.Random;

public class Archer extends Warrior<Bow, WoodenShield>{
    public Archer(String name, Bow nameBow, WoodenShield woodenShield, int healthPoint) {
        super(name, nameBow, woodenShield, healthPoint);
    }

    int range() {
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
