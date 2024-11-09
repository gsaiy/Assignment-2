package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library{
    ArrayList <Book> lis= new ArrayList();
    public void addbook()
    {
        Book obj=new Book();
        lis.add(obj);
    }
    public void lendbook()
    {
        Scanner myobj=new Scanner(System.in);
        String tit;
        // Book xx=new Book();
        // System.out.println(xx.getlentstatus());
        tit=myobj.nextLine();
        for(Book book : lis) {
            if(book.gettitle().equals(tit)){
                book.lend();
            }
        }
    }
    public void returnbook()
    {
        Scanner myobj=new Scanner(System.in);
        String tit;
        tit=myobj.nextLine();
        // System.out.println(lis.get(0).getlentstatus());
        for (Book book : lis) {
            // System.out.println(book.getlentstatus());
            if(book.gettitle().equals(tit)){
                book.retu();
            }
        }
    }
    public void listbook()
    {
       System.out.println(lis);
    //    for (int i = 0; i <lis.size(); i++) {
    //        lis.get(i).toStrin();
    //    }
        System.out.println("Availabe Books for Lending");
        for (Book book : lis) {
            if(!book.getlentstatus())
            {
            System.out.println("\t"+book.toStrin());
        }
    }
    System.out.println("Already Lended Books");
        for (Book book : lis) {
            if(book.getlentstatus())
            {
            System.out.println("\t"+book.toStrin());
        }
    }
    }

}