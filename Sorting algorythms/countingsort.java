import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] array) {
        int max = Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
        int min = Arrays.stream(array).min().orElse(Integer.MAX_VALUE);
        int range = max - min + 1;
        
        int[] count = new int[range];
        int[] output = new int[array.length];
        
      
        for (int num : array) {
            count[num - min]++;
        }
        
        // Compute prefix sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }
        
       
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(array));
        
        countingSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
