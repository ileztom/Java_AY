import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Before removal: " + list);
        list.remove(3); // Удаление элемента по индексу 3
        System.out.println("After removal: " + list);
    }
}