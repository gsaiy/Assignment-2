package flour;
import java.util.Scanner;

public class flour
{
    double weight;
    double price;
    double total;
    public flour() {
        System.out.println("Enter the weight");
        Scanner myobj=new Scanner(System.in);
        weight=myobj.nextDouble();
        System.out.println("Enter the price per kg");
        price=myobj.nextDouble();
    }
    public flour(double weight,double price)
    {
        this.weight=weight;
        this.price=price;
        calculate();
    }
    public double calculate()
    {
        total=weight*price;
        return total;
    }
    public double getweight()
    {
        return weight;
    }
    public double getprice()
    {
        return price;
    }
    public void display()
    {
        System.out.println("Weight of floor is "+getweight());
        System.out.println("Price of the floor is "+getprice());
        System.out.println("Total bill for the floor will be "+calculate());
    }
}