package model;

public class Nurse extends User {
	
	private String speciality;

	public Nurse(String name, String email) {
		super(name, email);
		// TODO Auto-generated constructor stub
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public void showDataUser() {
		System.out.println("empleado del Hospital: COSAMI");
		System.out.println("Departamento: Nutriologia, forense");
		
	}
	
	

}
