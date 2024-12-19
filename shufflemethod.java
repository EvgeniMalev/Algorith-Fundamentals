import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        Collections.shuffle(numbers);

        System.out.println("Shuffled List: " + numbers);
    }
}
