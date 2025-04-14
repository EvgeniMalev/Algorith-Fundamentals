public class ShellSortExample {

    public static void shellSort(String[] animals) {
        int n = animals.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                String temp = animals[i];
                int j;
                
                for (j = i; j >= gap && animals[j - gap].compareTo(temp) > 0; j -= gap) {
                    animals[j] = animals[j - gap];
                }

                animals[j] = temp;
            }
        }
    }

    public static void printArray(String[] arr) {
        for (String animal : arr) {
            System.out.print(animal + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] animals = {"Zebra", "Elephant", "Dog", "Cat", "Bear", "Giraffe", "Ant"};

        System.out.println("Before sorting:");
        printArray(animals);

        shellSort(animals);

        System.out.println("After sorting:");
        printArray(animals);
    }
