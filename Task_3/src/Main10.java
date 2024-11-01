import java.util.ArrayList;
import java.util.Collections;

public class Main10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original list: " + list);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}