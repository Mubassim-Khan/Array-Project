import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        System.out.print("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int maxCount = 0;
        int repeatedNumber = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                repeatedNumber = array[i];
            }
        }

        if (maxCount <= 1) {
            System.out.println("No Repeated elements");
            for (int i : array) {
                System.out.print(i + " ");
            }
        } else {
            int[][] Array_2D = new int[maxCount][size];

            // Fill array with 0's
            for (int i = 0; i < maxCount; i++) {
                for (int j = 0; j < size; j++) {
                    Array_2D[i][j] = 0;
                }
            }

            // Put 1st element of row to repeatedNumber
            for (int i = 0; i < maxCount; i++) {        // maybe prob here (i < maxCount or size)
                Array_2D[0][i] = repeatedNumber;
            }

            // Fill rest of the array
            for (int i = 1; i < maxCount; i++) {
                for (int j = 0; j < size; j++) {
                    if (array[j] != repeatedNumber) {
                        Array_2D[i][j] = array[j];
                    }
                }
            }

            // Print Array
            for (int i = 0; i < maxCount; i++) {
                for (int j = 0; j < size; j++) {
                    if (Array_2D[i][j] != 0) {
                        System.out.print(Array_2D[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}