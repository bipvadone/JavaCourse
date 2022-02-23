
public class Doctor {

	//atributos
	static int id=0; //autoincrement
	String name;
	String speciality;
	String email;
	
	Doctor()
	{
		System.out.println("Construyendo doctor");
		
	}
	
	Doctor(String name, String speciality)
	{
		id++;
	   System.out.println("El nombre del doctor asignado es: "+name);	
	   this.name=name;
	   this.speciality=speciality;
	}
	
	//comportamientos
	public void showNme()
	{
		System.out.println(name);
	}
	
	public void showId()
	{
		System.out.println("id doctor: "+ id);
	}	
}
