import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Before modification: " + list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 2);
        }
        System.out.println("After modification: " + list);
    }
}