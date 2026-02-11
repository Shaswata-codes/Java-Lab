import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4]; // size 4

        try {
            System.out.println("Enter 5 numbers:");

            // purposely exceeding index
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt(); // exception when i = 4
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        sc.close();
    }
}
