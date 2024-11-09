package library;

import java.util.Scanner;

public class Book extends AbstractBook{
    private String BookType;
    public Book()
    {
        super();
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the Booktype of the book");
        this.BookType=myobj.nextLine();
    }
    public String getBookType()
    {
        return this.BookType;
    }
    public String toStrin()
    {
        return "Title : "+gettitle()+"\t Author : "+getauthor() + " \t BookType : "+getBookType();
    }
}
