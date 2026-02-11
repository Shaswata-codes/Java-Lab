public class Main {

    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("Hello World");
        
        try {
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("Array index out of bounds!");
        }
        
        System.out.println("Hello World2");

        

        
    }
}
