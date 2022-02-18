
public class Doctor {

	//atributos
	static int id=0; //autoincrement
	String name;
	String speciality;
	
	Doctor()
	{
		System.out.println("Construyendo doctor");
		id++;
	}
	
	Doctor(String name)
	{
	   System.out.println("El nombre del doctor asignado es: "+name);	
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
