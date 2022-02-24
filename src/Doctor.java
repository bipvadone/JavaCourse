import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

 
	private String speciality;

 

	Doctor(String name, String email) {
		super(name,email);
		
		
		System.out.println("El nombre del doctor asignado es: " + name);
 
		this.speciality = speciality;
		
	}

 
 

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

 
	ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
	public void addAvailableApointment(Date date,String time)
	{
		availableAppointment.add(new AvailableAppointment(date, time));
		
	}
	
	public ArrayList<AvailableAppointment> getAvailableAppointments(){
		return availableAppointment;
	}
	
	
	public static class AvailableAppointment {
		private int id;
		private Date date;
		private String time;

		public AvailableAppointment(Date date, String time) {

			this.date = date;
			this.time = time;
		}

		public int getId() {
			return id;
		}

		public void setId_availableAppointment(int id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
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

	}

}
