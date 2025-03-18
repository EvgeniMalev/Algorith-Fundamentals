import java.util.*;

public class BucketSort {
    
    public static void bucketSort(float[] arr) {
        if (arr.length == 0) {
            return;
        }
        
        int n = arr.length;
        List<Float>[] buckets = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        

        for (float num : arr) {
            int bucketIndex = (int) (num * n); 
            buckets[bucketIndex].add(num);
        }
        

        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
        }
        
        int index = 0;
        for (List<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }
    
    public static void main(String[] args) {
        float[] arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f, 0.51f};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        bucketSort(arr);
        
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
