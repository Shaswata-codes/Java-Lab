import java.util.Scanner;

class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Section: ");
        String sec = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Section: " + sec);
    }
}
