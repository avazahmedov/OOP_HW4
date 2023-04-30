public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>();
        archerTeam.addWarrior(new Archer("Avaz", new Bow(), new WoodenShield(), 45))
                .addWarrior(new Archer("Karima", new Bow(), new WoodenShield(), 55));

        Team<Assasin> assasinTeam = new Team<>();
        assasinTeam.addWarrior(new Assasin("Sergei", new Knife(), new IronShield(), 40))
                .addWarrior(new Assasin("Yurii",  new Knife(), new IronShield(), 50));

        System.out.println(archerTeam);
        System.out.println(assasinTeam);

        Battle newBattle = new Battle(new Archer("Avaz", new Bow(), new WoodenShield(), 35),
                    new Assasin("Sergei", new Knife(), new IronShield(), 65));
        
        Warrior winner = newBattle.fight();
        System.out.println("-------------------------------------------------------");
        System.out.println(winner);
    }
}
