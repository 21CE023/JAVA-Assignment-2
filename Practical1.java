// Design a class named Circle containing following attributes and behavior. 
// One double data field named radius. The default value is 1. 
// A no-argument constructor that creates a default circle. 
// A Single argument constructor that creates a Circle with the specified radius. 
// A method named getArea() that returns area of the Circle. 
// A method named getPerimeter() that returns perimeter of it. 
// 21CE023   Jyot Delvadiya

import java.util.*;

class Circle{
    double radius = 1,area,peri;
    Circle(){
        System.out.println("Creates one Circle...");
    }
    Circle(double radius){
        System.out.println("Creates Circle with Radius " + radius);
        this.radius = radius;
    }
    void getarea(){
        area = (3.14)*(radius)*(radius);
        System.out.println("Area : " + area);
    }
    void getPerimeter(){
        peri = 2*(3.14)*(radius);
        System.out.println("Perimeter : " + (float)peri);
    }

}
public class Practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle : ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        c.getarea();
        c.getPerimeter();
    }
}
