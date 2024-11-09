package library;

import java.util.Scanner;

public abstract class  AbstractBook
{
    private String title;
    private String author;
    private boolean isLent;
    public AbstractBook()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the title of the book");
        this.title=myobj.nextLine();
        System.out.println("Enter the author of the book");
        this.author=myobj.nextLine();
        this.isLent=false;
    }
    public String gettitle()
    {
        return this.title;
    }
    public String getauthor()
    {
        return this.author;
    }
    public boolean getlentstatus()
    {
        return this.isLent;
    }
    public void lend()
    {
        if(isLent==false)
        {
        this.isLent=true;
        System.out.println(this.title+" is Lent to you");
        }
        else
        {
            System.out.println("Sorry, "+ this.title+" is already lent");
        }
    }
    public void retu()
    {
        this.isLent=false;
    }
    public abstract String getBookType();
    public String toStrin()
    {
        return "Title of the book is "+gettitle()+" Author of the Book is "+getauthor();
    }
}