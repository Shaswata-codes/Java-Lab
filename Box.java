import java.util.Scanner;

class Box {
    int l, b, h;

    Box(int l, int b, int h) {
        this.l =l;
        this.b=b;
        this.h=h;
    }

    int volume(){
        return l*b*h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b= sc.nextInt();
        int h = sc.nextInt();
        Box box = new Box(l, b, h);
        System.out.println(box.volume());
    }
}