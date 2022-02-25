package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {

	public static String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Nombiembre", "Diciemnbre" };
	public static Doctor doctorLogged;
	public static Patient patientLogged;

	public static void showMenu() {
		System.out.println("Welcome to My Appointments");
		System.out.println("Selecciona la opción deseada");

		int response = 0;
		do {
			
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			System.out.println("0. Salir");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
			case 1:
				System.out.println("Doctor");
				authUser(1);
				break;
			case 2:
				response = 0;
				// showPatientMenu();
				authUser(2);
				break;
			case 0:
				System.out.println("Thank you for you visit");
				break;
			default:
				System.out.println("Please select a correct answer");
			}
		} while (response != 0);
	}

	private static void authUser(int userType) {
		// UserTypep=1 Doctor
		// usertYPE=2 patient

		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("hebert", "hebert@gmail.com"));
		doctors.add(new Doctor("luis", "luis@gmail.com"));
		doctors.add(new Doctor("pepe", "pepe@gmail.com"));

		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(new Patient("carlos", "carlso@gmail.com"));
		patients.add(new Patient("juan", "juan@gmail.com"));
		patients.add(new Patient("dario", "dario@gmail.com"));

		boolean emailCorrect = false;
		do {
			System.out.println("Insert your email: [a@a.com]");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			if (userType == 1) {
				for (Doctor d : doctors) {
					if (d.getEmail().equals(email)) {
						emailCorrect = true;
						//obtener el usuario logeado
						doctorLogged=d;
						//showdoctormenu
						UIDoctorMenu.showDoctorMenu();
						
						
					
					}
				}

			}
			if (userType == 2) {
				for(Patient p :patients)
				{
					if(p.getEmail().contentEquals(email))
					{
						emailCorrect=true;
						patientLogged=p;
						//showPatientMenu
						UIPatientMenu.showPatientMenu();
						
					}
				}
			}

		} while (!emailCorrect);

	}

	static void showPatientMenu() {
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("Patient");
			System.out.println("1. Book an appointment");
			System.out.println("2. My appointments");
			System.out.println("0. Return");
 
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
			case 1:
				System.out.println("::Book an appointment");
				for (int i = 1; i < 4; i++) {
					System.out.println(i + ". " + MONTHS[i]);

				}
				break;
			case 2:
				System.out.println("::My appointments");
				break;
			case 0:
				showMenu();
				break;
			}
		} while (response != 0);
	}

}
