import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Avocado");

        System.out.println("Before removal: " + list);
        list.removeIf(s -> s.startsWith("A"));
        System.out.println("After removal: " + list);
    }
}