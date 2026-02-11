interface Motor{
    void run();
    void consume();
}

class WashingMachine implements Motor {
    int capacity;
    public void run() {
        System.out.println("Motor running...");
    }
    public void consume() {
        System.out.println("Consuming electricity...");
    }
    void showCapacity() {
        System.out.println("Capacity of motor is " + capacity + " kg");
    }
}

public class Main {
    public static void main(String[] args){
        WashingMachine wm = new WashingMachine();
        wm.capacity = 7;
        wm.run();
        wm.consume();
        wm.showCapacity();
    }
}
