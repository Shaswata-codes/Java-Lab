class Rectangle {
    double length, breadth;
    Rectangle() {
        length = 0;
        breadth = 0;
    }
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("Area = " + (length * breadth));
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        Rectangle r2 = new Rectangle(10, 5);
        r2.area();
    }
}
