import java.util.*;
import java.util.Scanner;

public class pra3 {
    private int id = 0;
    private int bal[] = { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
    private int withdraw;
    private int deposit;
    private int tra;
    private int tra_money;

    public pra3() {
        Date d = new Date();
        System.out.println("Date : " + d);
    }

    public pra3(int ID, int BAL) {
        id = ID;
        // bal[] = BAL;
    }

    public int withdrawn(int with) {
        bal[id] -= with;
        return bal[id];
    }

    public int deposit(int dep) {
        bal[id] += dep;
        return bal[id];
    }

    public int Balance(int Id) {

        return bal[id];
    }

}
