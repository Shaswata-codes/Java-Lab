import java.util.Scanner;

abstract class Student {
    int rollno;
    long regno;

    abstract void getInput();
}

class Kiitian extends Student {
    String course;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rollno: ");
        rollno = sc.nextInt();

        System.out.print("Enter Registration no: ");
        regno = sc.nextLong();

        course = "B.Tech (Computer Science & Engg)";
    }

    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        System.out.println("Course - " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput();
        k.display();
    }
}
