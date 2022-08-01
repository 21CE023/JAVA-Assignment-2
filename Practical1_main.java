import java.util.*;

public class Practical1_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practical1 pr = new Practical1();
        System.out.println("Enter Radius of Circle : ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        c.getarea();
        c.getPerimeter();
    }
}
