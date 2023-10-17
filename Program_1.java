import java.util.Scanner;

public class Program_1 {
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

        // Sort Array using Bubble Sort
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        int firstNo = array[0];
        int range = array[size - 1];
        boolean isSame;

        // To find missing elements
        System.out.print("Missing elements are: ");
        for (int i = firstNo; i <= range; i++) {
            isSame = false;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    isSame = true;
                    break;
                }
            }
            if (!isSame) {
                System.out.print(i + " ");
            }
        }
    }
}