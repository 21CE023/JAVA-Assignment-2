// Design a class named Circle containing following attributes and behavior. 
// One double data field named radius. The default value is 1. 
// A no-argument constructor that creates a default circle. 
// A Single argument constructor that creates a Circle with the specified radius. 
// A method named getArea() that returns area of the Circle. 
// A method named getPerimeter() that returns perimeter of it. 
// 21CE023   Jyot Delvadiya

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

