public class IronShield implements Shield{
    @Override
    public int protection() {
        return 65;
    }

    @Override
    public String toString() {
        return String.format("Iron Shield, Protection: %d", protection());
    }
}
