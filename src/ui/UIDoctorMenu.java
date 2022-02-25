package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;

public class UIDoctorMenu {

	public static ArrayList<Doctor> doctorsAvailableAppoinmets = new ArrayList<>();

	public static void showDoctorMenu() {
		int response = 0;

		do {

			System.out.println("\n\n"); 
			System.out.println("Doctor");
			System.out.println("Welcome " + UIMenu.doctorLogged.getName());
			System.out.println("1. Add Available Appoitment");
			System.out.println("2. My schedule appointments");
			System.out.println("0. logout");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
			case 1:
				showAddAvailableAppointmentMenu();
				break;
			case 2:
				break;
			case 0:
				UIMenu.showMenu();
				break;
			}

		} while (response != 0);

	}

	private static void showAddAvailableAppointmentMenu() {
		int response = 0;
		do {

			System.out.println();
			System.out.println("::Add Available Appointment");
			System.out.println("::Select a month");

			for (int i = 0; i < 3; i++) {
				int j = i + 1;

				System.out.println(j + ". " + UIMenu.MONTHS[i]);

			}

			System.out.println("0. Return");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			if (response > 0 && response < 4) {
				// 1,2,3

				int monthSelected = response;
				// System.out.println(monthSelected+ " . "+ UIMenu.MONTHS[monthSelected-1]);
				System.out.println("insert the date available: [dd/mm/yyyy]");

				Scanner scdate = new Scanner(System.in);
				String date = scdate.nextLine();

				System.out.println("your date is: " + date + "\n 1. correct  \n2. change date");
				int responseDate = Integer.valueOf(sc.nextLine());
				if (responseDate == 2)
					continue;

				int responseTime = 0;
				String time = "";
				do {
					System.out.println("Insert the time available for date: " + date + "[16:000]");
					time = sc.nextLine();
					System.out.println("your time is: " + date + "\n 1. correct  \n2. change time");
					responseTime = Integer.valueOf(sc.nextLine());

				} while (responseTime == 2);

				UIMenu.doctorLogged.addAvailableApointment(date.toString(), time);

				checkDoctorAvailableAppoinments(UIMenu.doctorLogged);

			} else if (response == 0) {
				showDoctorMenu();
			}

		} while (response != 0);

	}

	private static void checkDoctorAvailableAppoinments(Doctor doctor) {
		if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppoinmets.contains(doctor)) {

			doctorsAvailableAppoinmets.add(doctor);
		}

	}

}
