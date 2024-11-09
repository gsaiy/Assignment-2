// import com.cafe.CoffeeOrder;
import com.CafeOrder;
import java.util.ArrayList;
import java.util.Scanner;


public class mai
{
    int orderid=1;
    ArrayList<String> typ=new ArrayList();
    ArrayList<String> siz=new ArrayList();
    ArrayList<Integer> ordertotal=new ArrayList();
    int total=0;
    Scanner myobj=new Scanner(System.in);
    void placeorder()
    {
        int choice=1;
        CafeOrder obj=new CafeOrder();
        typ.add("Type");
        siz.add("Size");
        ordertotal.add(0);
        while(choice==1)
        {
            typ.add(obj.selectCoffee());
            siz.add(obj.selectSize());
            ordertotal.add(obj.getPrice());
            System.out.println("Enter 1 if you wanna order something more else any other number");
            choice=myobj.nextInt();
            orderid++;
        }
    }
    void showordersummary()
    {
        System.out.println("-----------------------------------------");
        for (int i = 0; i <orderid; i++) {
            // System.out.println(i);
            System.out.print("  "+typ.get(i));
            System.out.print("  " + siz.get(i));
            if(i==0)
            {
                System.out.print("  Price $");  
            }
            else
            {
            System.out.print("  $"+ordertotal.get(i));
            total += ordertotal.get(i);
        }
            System.out.println("");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total Order Value $"+total);
        System.out.println("-----------------------------------------");

    }
    public static void main(String[] args)
    {
        mai objj=new mai();
        objj.placeorder();
        objj.showordersummary();
    }
}