import java.util.*;
import java.util.stream.Collectors;

public class DataManipulation {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 25, 34, 45, 54, 64, 70, 80, 90, 100);
        
        List<Integer> sortedData = new ArrayList<>(data);
        Collections.sort(sortedData);
        System.out.println("Sorted Data: " + sortedData);

        List<Integer> filteredData = data.stream()
                .filter(num -> num > 50)
                .collect(Collectors.toList());
        System.out.println("Filtered Data (>50): " + filteredData);

        int sum = data.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of Data: " + sum);

        List<Integer> transformedData = data.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println("Transformed Data (*2): " + transformedData);
    }
}
