package hospital;

import hospital.doctors.Specialist;
public class Appointment {

    Specialist obj;
    public Appointment(Specialist ob) {
        obj=ob;
    }

    public void schedule()
    {
        obj.bookappointment();
    }
}
