import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        for (String item : list) {
            System.out.println(item);
        }
    }
}