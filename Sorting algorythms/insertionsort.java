public class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr1[] = {66, 70, 73, 5, 7, 9, 56};
        int arr2[] = {67, 76, 72, 5, 7, 9, 56};

        InsertionSort ob = new InsertionSort();
        
        System.out.print("Original arr1: ");
        printArray(arr1);
        ob.sort(arr1);
        System.out.print("Sorted arr1:   ");
        printArray(arr1);

        System.out.print("\nOriginal arr2: ");
        printArray(arr2);
        ob.sort(arr2);
        System.out.print("Sorted arr2:   ");
        printArray(arr2);
    }
}
