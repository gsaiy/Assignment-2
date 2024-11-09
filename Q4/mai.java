import hospital.Appointment;
import hospital.doctors.Specialist;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class mai {
    public static void main(String[] args) 
    {
       Specialist obj=new Specialist();
       Specialist obj2=new Specialist();
       System.out.println("two Doctors Available enter 1 for "+obj.getname()+" 2 for "+obj2.getname()); 
       Scanner myobj=new Scanner(System.in);
        int choice=myobj.nextInt();
       Appointment ob;
       
       if(choice==1)
       { 
        ob=new Appointment(obj);
       ob.schedule();
       }
       else if(choice==2)
       {
        ob=new Appointment(obj2);
       ob.schedule();
       }
       else{
        System.out.println("Enter valid doctor name");
       }
    }
}
