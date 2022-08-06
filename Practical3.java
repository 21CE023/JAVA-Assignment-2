// Use the Account class created as above to simulate an ATM machine.
// Create 10 accounts with id AC001.....AC010 with initial balance 300₹.
// The system prompts the users to enter an id. If the id is entered incorrectly,
// ask the user to enter a correct id. Once an id is accepted, display
// menu with multiple choices.
// 1.Balance inquiry
// 2.Withdraw money [Maintain minimum balance 300₹] 3.Deposit money
// 4.Money Transfer
// 5.Create Account
// 6.Deactivate Account
// 7.Exit Hint: Use ArrayList, which is can shrink and expand with compared
// to Array.

// 21CE023   Jyot Delvadiya

import java.util.*;
import java.util.Scanner;

public class pra3 {
    private int id = 0;
    private int bal[] = { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };

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
