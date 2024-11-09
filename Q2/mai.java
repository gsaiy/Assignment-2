import com.Kiosk;
import java.util.Scanner;

class mai {
    
    public static void main(String[] args) {
        Kiosk obj=new Kiosk();
        Scanner myobj=new Scanner(System.in);
        String custid;
        int amt;
        System.out.println("Enter Customer ID");
        custid=myobj.nextLine();
        System.out.println("Enter Amount");
        amt=myobj.nextInt();
        obj.fivehundredhandler(amt);
        System.out.println("For Customer Id "+custid+" Bill for $ "+amt+" is Processed with following Denominations");
        obj.display();


    }
}