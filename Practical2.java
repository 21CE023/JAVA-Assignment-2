// Design a class named Account that contains:
// •A private int data field namedid for the account (default 0).
// •A private double data field named balance for the account (default 500₹).
// •A no-arg constructor that creates a default account.
// •The accessor method for dateCreated.
// •A method named getMonthlyInterest() that returns the monthly interest.
// •A method named deposit that deposits aspecified amount to the account.
// •A private double data field named annualInterestRate that stores the
// currentinterest rate (default 7%). Assume all accounts have the same
// interest rate.
// •A private Date data field named dateCreated that stores the date
// when theaccount was created.
// •A constructor that creates an account with the specified id and initial
// balance
// .•The accessor and mutator methods for id, balance, and
// annualInterestRate.
// •A method named getMonthlyInterestRate() that returns the monthlyinterest
// •A method named withdraw that withdraws a specified amount from
// theaccount.

// 21CE023   Jyot Delvadiya

import java.util.*;

public class Practical2 {
    private int id = 0;
    private double Balance = 500.0;
    private double annualInterestRate = 7d;
    public int withdraw;
    public int deposite;

    Scanner sc = new Scanner(System.in);

    Practical2() {
        // date = "07-06-2022";
        Date d = new Date();
        System.out.println("Date : " + d);
    }

    Practical2(int Id, double balance) {
        id = Id;
        Balance = balance;
    }

    public int id() {
        return id;
    }

    public int getid() {
        id = sc.nextInt();
        return id;
    }

    public Double Balance() {
        return Balance;
    }

    public Double getBalance() {
        Balance = sc.nextDouble();
        return Balance;
    }

    public Double annualInterestRate() {
        return annualInterestRate;
    }

    public Double GetAnnualInterestRate() {
        annualInterestRate = sc.nextDouble();
        return annualInterestRate;
    }

    // public Date date(){
    // return d;
    // }
    public double Withdraw(double withdraw) {
        Balance -= withdraw;
        return (Balance);
    }

    public double Deposite(double deposite) {
        Balance += deposite;
        return (Balance);
    }

    public double MonthlyIntrestRate() {
        return (annualInterestRate / 12.0);
    }

    public double MonthlyIntrest() {
        double Mi = (annualInterestRate / 1200.0) * (Balance);
        return Mi;
    }

}