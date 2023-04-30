import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team<T extends Warrior>{
    List<T> warriorList = new ArrayList<>();

    public Team<T> addWarrior(T t){
        warriorList.add(t);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item:warriorList) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append(String.format("health: %s, damage %s, maxrange %s", healthPoints(), damages(), maxRange()));
        return sb.toString();
    }

    public int healthPoints() {
        int sum = 0;
        for (T item :warriorList){
            sum += item.getHealthPoint();
        }
        return sum;
    }

    public int damages(){
        int sum = 0;
        for (T item :warriorList){
            sum += item.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange(){
        int max = 0;
        for(T item: warriorList){
            if (item instanceof Archer){
                if(max<((Archer) item).range()) max = ((Archer) item).range();
            }
        }
        return max;
    }

    public int minShield(){
        int min = warriorList.get(0).protect.protection();
        for(T item: warriorList){
            if(min < item.protect.protection()) min = item.protect.protection();
        }
        return min;
    }
}
