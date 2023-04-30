public class WoodenShield implements Shield{
    @Override
    public int protection() {
        return 35;
    }

    @Override
    public String toString() {
        return String.format("Wooden shield, Protection: %d", protection());
    }
}
