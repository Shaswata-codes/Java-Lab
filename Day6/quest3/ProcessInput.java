import java.util.Scanner;


class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}
public class ProcessInput {

    static void processInput(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("number should be positive");
        }
        else {
            System.out.println("Double value: " + (2 * n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            processInput(num);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
