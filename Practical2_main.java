import java.util.*;

public class Practical2_main {
    public static void main(String[] args) {
        Practical2 pr = new Practical2();
        Scanner sc = new Scanner(System.in);
        // String Date = pr.date();
        // System.out.println("DATE : " + Date);
        int ID;
        double BALANCE, interestRATE;
        for (int i = 0; i >= 0; i++) {
            ID = pr.id();
            System.out.println("ID : " + ID);
            BALANCE = pr.Balance();
            System.out.println("BALANCE : " + BALANCE);
            interestRATE = pr.annualInterestRate();
            System.out.println("interestRATE : " + interestRATE + " %");

            System.out.printf("For Deposite enter 1\nFor Withdraw enter 2\nFor EXIT enter 0\nEnter Here : ");
            int j = sc.nextInt();
            if (j == 2) {
                System.out.println("Enter Money you want to Withdraw : ");
                double withdraw = sc.nextDouble();
                double WithdraW = pr.Withdraw(withdraw);
                System.out.println("WithdraW : " + withdraw);
                System.out.println("Balance : " + WithdraW);

                double MIR = pr.MonthlyIntrestRate();
                System.out.printf("MIR : %.4f", (float) MIR);
                System.out.println(" %");
                double MI = pr.MonthlyIntrest();
                System.out.printf("Monthly Interest : %.4f \n", (float) MI);
                continue;

            }

            else if (j == 1) {
                System.out.println("Enter Money you want to Deposite : ");
                double deposite = sc.nextDouble();
                double DeposiTe = pr.Deposite(deposite);
                System.out.println("DeposiTe : " + deposite);
                System.out.println("Balance : " + DeposiTe);

                double MIR = pr.MonthlyIntrestRate();
                System.out.printf("MIR : %.4f", (float) MIR);
                System.out.println(" %");
                double MI = pr.MonthlyIntrest();
                System.out.printf("MI : %.4f \n", (float) MI);
                continue;
            }

            else {
                break;
            }
        }

        System.out.print("Enter 1 If you want to create new Account (Else 0) : ");
        int x = sc.nextInt();
        if (x == 1) {

            for (int i = 0; i >= 0; i++) {
                System.out.print("Enter your ID : ");
                ID = pr.getid();
                System.out.print("Enter your Balance : ");
                BALANCE = pr.getBalance();
                System.out.print("Enter Annual Interest Rate : ");
                interestRATE = pr.GetAnnualInterestRate();
                System.out.println("ID : " + ID);
                System.out.println("BALANCE : " + BALANCE);
                System.out.println("interestRATE : " + interestRATE + " %");

                System.out.printf("For Deposite enter 1\nFor Withdraw enter 2\nFor EXIT enter 0\nEnter Here : ");
                int j = sc.nextInt();
                if (j == 2) {
                    System.out.println("Enter Money you want to Withdraw : ");
                    double withdraw = sc.nextDouble();
                    double WithdraW = pr.Withdraw(withdraw);
                    System.out.println("WithdraW : " + withdraw);
                    System.out.println("Balance : " + WithdraW);

                    double MIR = pr.MonthlyIntrestRate();
                    System.out.printf("MIR : %.2f", (float) MIR);
                    System.out.println(" %");
                    double MI = pr.MonthlyIntrest();
                    System.out.printf("Monthly Interest : %.2f \n", (float) MI);
                    continue;

                }

                else if (j == 1) {
                    System.out.println("Enter Money you want to Deposite : ");
                    double deposite = sc.nextDouble();
                    double DeposiTe = pr.Deposite(deposite);
                    System.out.println("DeposiTe : " + deposite);
                    System.out.println("Balance : " + DeposiTe);

                    double MIR = pr.MonthlyIntrestRate();
                    System.out.printf("MIR : %.2f", (float) MIR);
                    System.out.println(" %");
                    double MI = pr.MonthlyIntrest();
                    System.out.printf("MI : %.2f \n", (float) MI);
                    continue;
                }

                else {
                    break;
                }

            }
        }
        else{
            System.out.println("Thanks For Visiting...");
        }

    }
}