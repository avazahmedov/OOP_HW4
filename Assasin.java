public class Assasin extends Warrior<Knife, IronShield>{
    public Assasin(String name, Knife nameKnife, IronShield ironShield, int healthPoint) {
        super(name, nameKnife, ironShield, healthPoint);
    }

    @Override
    public String toString() {
        return String.format("Assassin: %s", super.toString());
    }
}
