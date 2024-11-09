package hospital.doctors;

import hospital.Doctor;
import java.util.Scanner;
public class Specialist extends Doctor{
    private String expertise;
    public Specialist()
    {
        super();
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the expertise of the doctor" +getname());
        this.expertise= myobj.nextLine();
    }
    public void bookappointment()
    {
        Scanner myobj = new Scanner(System.in);
        int date;
        System.out.println("Enter the date for which you wanna book appointment");
        date= myobj.nextInt();

        System.out.println("Appointment booked for "+date+" for doctor "+ getname());
    }
}
