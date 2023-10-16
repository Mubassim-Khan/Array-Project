import java.util.Scanner;

public class Program_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Enter elements: ");
        for (int i = 0; i <= size - 2; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // int sumOfAll = (size * (size + 1)) / 2;
        // int sumOfArray = 0;
        // for (int i = 0; i <= size - 2; i++) {
        // sumOfArray = sumOfArray + array[i];
        // }
        // int missingNo = sumOfAll - sumOfArray;
        // System.out.println("Missing number is: " + missingNo);

        int xorOfArray = array[0];
        for (int i = 1; i <= size - 1; i++) {
            xorOfArray = xorOfArray ^ 1;
        }
        int xorAll = array[0];
        for (int i = 1; i <= size + 1; i++) {
            xorAll = xorAll ^ 1;
        }
        int missingNo = xorOfArray ^ xorAll;
        System.out.println("Missing number is: " + missingNo);
    }
}