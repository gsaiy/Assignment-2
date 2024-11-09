import com.Account;
import com.CurrentAccount;
import com.SavingsAccount;
import com.bank.exceptions.depositexception;
import com.bank.exceptions.withdrawalexception;
import java.util.Scanner;

public class mai { 
    public static void main(String[] args)
    {
        Account obj=new Account(1000);
        int choice=1,amt;
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter 1 to open Current Account while any number for Savings Account");
        choice=myobj.nextInt();
        if(choice!=1)
        {
            obj=new SavingsAccount(1000);
        }
        else
        {
            obj=new CurrentAccount(1000);
        }
        choice=1;
        while(choice!=0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("Enter the Task you wanna do");
            System.out.println("1 to Deposit the Money");
            System.out.println("2 to Withdraw th Money");
            System.out.println("3 to see the deatils");
            System.out.println("Any other number to exit");
            System.out.println("------------------------------------------------------");
            choice=myobj.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter Amount you wanna deposit");
                amt=myobj.nextInt();  
                try {
                    obj.deposit(amt);
                } catch (depositexception e) {
                    System.out.println(e.getMessage());
                }
                break;
                case 2:
                System.out.println("Enter Amount you wanna withdraw");
                amt=myobj.nextInt(); 
                try {
                    obj.withdraw(amt);   
                } catch (withdrawalexception e) {
                    System.out.println(e.getMessage());
                }
                catch(depositexception e)
                {
                    System.out.println(e.getMessage()); 
                }
                
                break;
                case 3:
                obj.displayinfo();
                break;
                default:
                    choice=0;
                    break;
            }
        }
    }
}
