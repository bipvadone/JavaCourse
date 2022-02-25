package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

 
	private String speciality;

 

	public Doctor(String name, String email) {
		super(name,email);
		
		
	//	System.out.println("El nombre del doctor asignado es: " + name);
 
	//	this.speciality = speciality;
		
	}

 
 

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

 
	private ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
	public void addAvailableApointment(String date,String time)
	{
		availableAppointment.add(new AvailableAppointment(date, time));
		
	}
	
	public ArrayList<AvailableAppointment> getAvailableAppointments(){
		return availableAppointment;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Speciality: "+speciality +" \nAvailable: "+availableAppointment.toString();
	}
	
	
	public static class AvailableAppointment {
		private int id;
		private Date date;
		private String time;
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");

		public AvailableAppointment(String date, String time) {

			try {
				this.date = format.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.time = time;
		}

		public int getId() {
			return id;
		}

		public void setId_availableAppointment(int id) {
			this.id = id;
		}

		public Date getDate(String DATE) {
			return date;
		}

		
		public String getDate() {
			return format.format(date);
		}

		
		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "Available Appointments \n Date: "+ date+ " \ntime: "+time;
		}
		
		

	}


	@Override
	public void showDataUser() {
		System.out.println("empleado del Hospital: Cruz roja");
		System.out.println("Departamento: Cancerologia");
		
	}

}
