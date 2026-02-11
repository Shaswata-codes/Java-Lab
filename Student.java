import java.util.*;
public class Student {
    int roll;
    int cgpa;
    String name;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no :");
        roll = sc.nextInt();
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter CGPA");
        cgpa = sc.nextInt();
        sc.close();
        
    }
}
