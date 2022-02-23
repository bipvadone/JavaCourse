import static ui.UIMenu.*;

import java.io.ObjectInputStream.GetField;


public class Main {

	public static void main(String[] args)
	{
 
		//showMenu();
		Doctor myDoctor = new Doctor("bip vadone", "cardiology")  ;
		
		System.out.println(myDoctor.name);
		System.out.println(myDoctor.speciality);
		
		Patient patient =new Patient("wilson","wilson@hotmail.com"); 
		patient.setWeight(54.6); 
		System.out.println(patient.getWeight());
		
		patient.setPhoneNumber("12345678");
		System.out.println(patient.getPhoneNumber());
 
		

		
		
	}
}
