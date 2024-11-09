package propertymanagement;

import java.util.Scanner;

public class Apartments implements Property{
    private String Location;
    private int Price;
    public Apartments()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the Location of the Apartment");
        this.Location= myobj.nextLine();
        System.out.println("Enter the Price ");
        this.Price= myobj.nextInt();
    }
    public void buy()
    {
        System.out.println("Bought Apartment @" + getlocation() + "at the price of"+ getprice());
    }
    public void sell()
    {
        System.out.println("Sold Apartment @" + getlocation() + "at the price of"+ getprice());
    }
    public String getlocation()
    {
        return Location;
    }
    public int getprice()
    {
        return Price;
    }
}
