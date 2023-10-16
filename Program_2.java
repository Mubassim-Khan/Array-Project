import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.print("Enter number to be divide: ");
        int num = scanner.nextInt();

        int sum = 0;
        int currentIndex = 1;
        boolean isDivisble = false;

        // Input elements
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Iterate over half array & check if they are divisible
        for (int i = 0; i < size / 2; i++) {
            sum = array[i] + array[size - currentIndex];
            currentIndex++;
            if (sum % num == 0) {
                isDivisble = true;
            } else {
                isDivisble = false;
            }
        }

        if (isDivisble == true) {
            System.out.println("Array is Divisible: TRUE");
        } else {
            System.out.println("Array is NOT Divisible: FALSE");
        }
    }
}