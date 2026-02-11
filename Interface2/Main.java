//package Interface2;

interface Salary{
    double earnings();
    double deductions(double basic);
    double bonus(double basic, double extra);
}
class Manager implements Salary{
    public double earnings(){
        double basic = 50000;
        return basic + (0.70*basic) + (0.15*basic);
    }
    public double deductions(double basic){
        return 0.10*basic;
    }
    public double bonus(double basic, double extra){
        return 0.50*basic;
    }
}

public class Main {
    public static void main(String[] args){
        double basic = 50000;
        Manager m = new Manager();
        System.out.println("Earnings : "+ m.earnings());
        System.out.println("Bounus : "+ m.bonus(basic, 0));
        System.out.println("Bonus : "+m.deductions(basic));
    }
}
