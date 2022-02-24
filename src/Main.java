import static ui.UIMenu.*;

import java.io.ObjectInputStream.GetField;
import java.util.Date;


public class Main {

	public static void main(String[] args)
	{
 
		//showMenu();
		Doctor myDoctor = new Doctor("bip vadone", "cardiology")  ;
		
		myDoctor.addAvailableApointment(new Date(), "4pm");
		myDoctor.addAvailableApointment(new Date(), "10am");
		myDoctor.addAvailableApointment(new Date(), "1pm");
		
		System.out.println(myDoctor.getAvailableAppointments());
		
		
		for(Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments())
		{
			System.out.println(availableAppointment.getDate()+" "+availableAppointment.getTime());
		}
		

		Patient patient = new Patient("Bip","bip@gmail.com");
		
		System.out.println(patient);
		
		
	}
}
