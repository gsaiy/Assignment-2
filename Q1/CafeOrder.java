package com;
import com.cafe.CoffeeOrder;
import java.util.Scanner;

public class CafeOrder implements CoffeeOrder {
    Scanner myobj = new Scanner(System.in);
    String coffeetype;
    String Size;
    int total;
    public String selectCoffee() {
        System.out.println("Availabe Coffees are:");
        System.out.println("Espresso : $3");
        System.out.println("Latte : $4");
        System.out.println("Cappuccino : $5");
        System.out.println("Enter 1 for Espresso, 2 for Latte, 3 for Cappuccino");
        int type = myobj.nextInt();
        switch (type) {
            case 1:
                coffeetype = "Espresso";
                total=3;
                break;
            case 2:
                coffeetype = "Latte";
                total=4;
                break;
            case 3:
                coffeetype = "Cappuccino";
                total = 5;
                break;
            default:
                selectCoffee();
                break;

        }
        return coffeetype;
        // if(type<1 || type>3)
        // {
        // System.out.println("Invalid Input Order Again");
        // return selectCoffee();
        // }
        // else
        // {
        // if(type==1)
        // {
        // return "Espresso";
        // }
        // else if(type==2)
        // {
        // return "latte";
        // }
        // else
        // {
        // return "Cappuccino";
        // }

        // }
    }

    public String selectSize() 
    {
        System.out.println("Deafult Size is Small Avaialbe Sizes are");
        System.out.println("Medium : +$1");
        System.out.println("Large : +$2");
        System.out.println("if you wanna Increase the size Enter 1 for Medium 2 for Large and 0 for deafult");
        int type = myobj.nextInt();
        switch (type) {
            case 1:
                Size= "Medium";
                total +=1;
                break;
            case 2:
                Size= "Large";
                total +=2;
                break;
            default:
                Size= "Small";
                break;

        }
        return Size;

    }

    public void displayOrder()
    {
        System.out.println("Last order Placed is");
        System.out.println(Size +" " + coffeetype +"  : $" + total);
    }

    public int getPrice()
    {
        int x=total;
        total=0;
        return x;
    }
}