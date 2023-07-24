import java.util.*;

public class randomisedSetImplementation {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(2));
        System.out.println(obj.remove(2));
    }
}

class RandomizedSet {
    HashSet<Integer> set;
    List<Integer> list;

    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!set.contains(val)) {
            set.add(val);
            list.add(val);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            list.remove((Integer) val);
            return set.remove(val);

        } else
            return false;

    }

    public int getRandom() {
        int r = (int) (Math.random() * set.size());
        return list.get(r);
    }
}