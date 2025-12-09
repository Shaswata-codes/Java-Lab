import java.util.Scanner;

class first {
first() {
}
public static void main(String[] var0) {
    Scanner var1 = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String var2 = var1.nextLine();
    System.out.print("Enter Roll: ");
    int var3 = var1.nextInt();
    var1.nextLine();
    System.out.print("Enter Section: ");
    String var4 = var1.nextLine();
    System.out.println("\n--- Student Details ---");
    System.out.println("Name: " + var2);
    System.out.println("Roll: " + var3);
    System.out.println("Section: " + var4);
}
}
