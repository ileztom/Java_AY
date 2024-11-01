import java.util.ArrayList;
import java.util.HashSet;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");

        System.out.println("Before removal: " + list);
        list = new ArrayList<>(new HashSet<>(list));
        System.out.println("After removal: " + list);
    }
}