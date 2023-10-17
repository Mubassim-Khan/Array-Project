import java.util.Scanner;

public class Program_4 {
    // Method to remove duplicate lemen
    static void removeDuplicate(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int temp;

        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Sort array using Bubble Sort
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print Result
        System.out.print("Duplicate Elements are: ");
        removeDuplicate(array);
    }
}
