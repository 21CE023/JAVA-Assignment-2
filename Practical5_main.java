// Develop a Program that illustrate method overloading concept.
//21CE023 Jyot Delvadiya

import java.util.*;

public class Practical5_main {
    public static void main(String[]args)
{   
    Practical5 p =new Practical5();
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Record of Students(Name, Grade and then Id):");
    String name=sc.next();
    String a=sc.next();
    int ID=sc.nextInt();
    char gd=sc.next().charAt(0); 
    System.out.println("string is:");
    p.record(a);
    System.out.println("Student Name and Grade:");
    p.record(name,gd);
    System.out.println("Id, Name and Grade:"); 
    p.record(ID,name,gd);
    } 
}
