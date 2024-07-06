import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(88);
        l2.add(8765);
        l2.add(879);
        l2.add(0,987);
        l1.add(6);
        l1.add(8);
        l1.add(9);
        l1.add(10);
        l1.add(67);
        l1.add(98);
        l1.add(0, 56);
        l1.add(0, 789);
        l1.addAll(0,l2);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(" " +l1.get(i));
        }
    }
}
