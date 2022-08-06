// Develop a Program that illustrate method overloading concept.
//21CE023 Jyot Delvadiya

import java.util.*;

public class Practical5 {
    void record(String t) {
        System.out.println(t);
    }

    void record(String studentName, char grade) {
        System.out.println("Student Name is " + studentName);
        System.out.println("Student Grade is " + grade);
    }

    void record(int id, String studentName, char grade) {
        System.out.println("Student ID is " + id);
        System.out.println("Student Name is " + studentName);
        System.out.println("Student Grade is " + grade);
    }
}
