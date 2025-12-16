import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("Enter details of student " + (i + 1));

            System.out.print("Roll No: ");
            s[i].roll = sc.nextInt();

            sc.nextLine(); // clear buffer
            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextDouble();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].roll + " " + s[i].name + " " + s[i].cgpa);
        }

        Student low = s[0];
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < low.cgpa) {
                low = s[i];
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + low.name);
    }
}
