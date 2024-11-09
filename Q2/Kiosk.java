package com;
import com.kios.DenominationHandler;
public class Kiosk implements DenominationHandler{
    int oramt;
    int count500;
    int count100;
    int count10;
    int count5;
    int count1;
    public void fivehundredhandler(int amt)
    {
        oramt=amt;
        while(amt >= 500)
        {
            count500++;
            amt=amt-500;
        }
        onehundredhandler(amt);
    }
    public void onehundredhandler(int amt)
    {
        
        while(amt >= 100)
        {
            count100++;
            amt=amt-100;
        }
        tenhandler(amt);
    }
    public void tenhandler(int amt)
    {
        
        while(amt >= 10)
        {
            count10++;
            amt=amt-10;
        }
        fivehandler(amt);
    }
    public void fivehandler(int amt)
    {
        
        while(amt >= 5)
        {
            count5++;
            amt=amt-5;
        }
        onehandler(amt);
    }
    public void onehandler(int amt)
    {
        count1=amt;
    }

    public void display()
    {
        System.out.println("-----------------------------------------------");
        System.out.println("Denomination    Count");
        System.out.println("$500 \t\t"+count500);
        System.out.println("$100 \t\t"+count100);
        System.out.println("$10 \t\t"+count10);
        System.out.println("$5 \t\t"+count5);
        System.out.println("$1 \t\t"+count1);
        System.out.println("-----------------------------------------------");
    }
}