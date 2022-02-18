import static ui.UIMenu.*;


public class Main {

	public static void main(String[] args)
	{
		Doctor myDoctor=new Doctor();
		
		myDoctor.name="BIP VADONE";
		
		myDoctor.showNme();
		myDoctor.showId();
		System.out.println(Doctor.id);
		
		Doctor myDoctroAnn =new Doctor();
		 myDoctor.showId();
		System.out.println(Doctor.id);

		
		showMenu();
		
		
	}
}
