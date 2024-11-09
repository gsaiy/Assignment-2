package hospital;

import java.util.Scanner;

public abstract class Doctor {
    private String name;
    private String specialization;
    public Doctor()
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the name of the doctor");
        this.name= myobj.nextLine();
        System.out.println("Enter the specialization of the "+name);
        this.specialization= myobj.nextLine();
    }
    public String getname()
    {
        return name;
    }
    public String getspecial()
    {
        return specialization;
    }
    public abstract void bookappointment();
}
