
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

class bankaccount {
    private String accholder;
    private double balance;
    private ArrayList<String> ministat = new ArrayList();

    public bankaccount() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the name of the Account Holder");
        this.accholder = myobj.nextLine();
        LocalTime myObj = LocalTime.now();
        balance = 0.0;
        ministat.add(myObj.toString() + "  Account Opened for " + accholder);
    }

    public void deposit(double amt) {
        if (amt < 0) {
            System.out.println("Enter Amount more than $0 to deposit");
        } else {
            balance += amt;
            LocalTime myObj = LocalTime.now();
            ministat.add(myObj.toString() + "  Deposit " + amt);
        }
    }

    public void Withdraw(double amt) {
        if (amt < 0) {
            System.out.println("Enter Amount more than $0 to withdraw");
        } else {
            if (amt > balance) {
                System.out.println("Enter Amount less than availabe balance to withdraw");
                checkbalance();
            } else {
                balance -= amt;
                LocalTime myObj = LocalTime.now();
                ministat.add(myObj.toString() + "  Withdraw " + amt);
            }
        }
    }

    public void printstat() {
        System.out.println("------------------------------------------------------");
        for (String str : ministat) {
            System.out.println(str);
        }

        System.out.println("------------------------------------------------------");
    }

    public void checkbalance() {
        System.out.println("Availabe Balance is " + balance);
    }
}

class bankingsystem {
    public bankingsystem() {
        bankaccount obj = new bankaccount();
        int choice = 1, amt;
        Scanner myobj = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("------------------------------------------------------");
            System.out.println("Enter the Task you wanna do");
            System.out.println("1 to Deposit the Money");
            System.out.println("2 to Withdraw th Money");
            System.out.println("3 to see the mini statement");
            System.out.println("4 to see the Check Balance");
            System.out.println("Any other number to exit");
            System.out.println("------------------------------------------------------");
            choice = myobj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount you wanna deposit");
                    amt = myobj.nextInt();

                    obj.deposit(amt);

                    break;
                case 2:
                    System.out.println("Enter Amount you wanna withdraw");
                    amt = myobj.nextInt();
                    obj.Withdraw(amt);

                    break;
                case 3:
                    obj.printstat();
                    break;
                case 4:
                    obj.checkbalance();
                    break;
                default:
                    choice = 0;
                    break;
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        bankingsystem obj=new bankingsystem();
    }
}
