abstract class Student{
    int rollNo;
    int regNo;
    void getInput(int roll, int reg){
        rollNo = roll;
        regNo = reg;
    }
    abstract void course();
}

class Kitian extends Student{
    String courseName;
    Kitian(String c){
        courseName = c;
    }
    void course(){
        System.out.println("Course : " + courseName);
    }
    void display(){
        System.out.println("Roll No : " + rollNo);
        System.out.println("Reg No : "+ regNo);
        course();
    }
};

public class Main{
    public static void main(String[] args){
        Kitian k = new Kitian("B.Tech (Computer Science)");
        k.getInput(24455125, 123456789);
        k.display();
    }
}