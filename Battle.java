import javax.swing.plaf.PanelUI;

public class Battle {
    private Warrior one;
    private Warrior two;

    public int remainingProtectOne;
    public int remainingProtectTwo;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;

    }
    public Warrior fight() {
        remainingProtectOne = one.protect.protection();
        remainingProtectTwo = two.protect.protection();
        while(one.getHealthPoint() > 0 && two.getHealthPoint() > 0){
            int hitOne = one.hit();
            int protectTwo = hitOne+1;
            while (protectTwo > hitOne) protectTwo = two.protectPoint();
            System.out.printf("First warrior hit damage %s, protected by shield %s. \n", hitOne, protectTwo);
            two.setHealthPoint(two.getHealthPoint() - hitOne + protectTwo);
            remainingProtectTwo -= protectTwo;
            if (remainingProtectTwo> 0) System.out.printf("Second warrior have healthPoint %s, remaining protect %d. \n", two.getHealthPoint(), remainingProtectTwo);
            else System.out.printf("Second warrior have healthPoint %s, remaining protect 0. \n", two.getHealthPoint());
            if(two.getHealthPoint() <= 0){
                return one;
            }
            System.out.println("-------------------------------------------------------");
            int hitTwo = two.hit();
            int protectOne = hitTwo+1;
            while (protectOne > hitTwo) protectOne = one.protectPoint();
            System.out.printf("Second warrior hit damage %s, protected by shield %s. \n", hitTwo, protectOne);
            one.setHealthPoint(one.getHealthPoint() - hitTwo + protectOne);
            remainingProtectOne -= protectOne;
            if (remainingProtectOne > 0) System.out.printf("First warrior have healthPoint %s, remaining protect %d. \n", one.getHealthPoint(), remainingProtectOne);
            else System.out.printf("First warrior have healthPoint %s, remaining protect 0. \n", one.getHealthPoint());
        }
        return two;
    }



}
