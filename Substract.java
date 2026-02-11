import java.util.Scanner;

public class Substract{
    int sub(int a, int b){
        return a-b;
    }
    int sub(int a, int b, int c){
        return a-b-c;
    }
    public static void main(String[] args){
        Substract s = new Substract();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        System.out.println(s.sub(a, b));
        System.out.println(s.sub(a, b, c));
        sc.close();
    }
}