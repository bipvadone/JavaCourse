package ui;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Doctor;

public class UIPatientMenu {
	public static void showPatientMenu() {
		int response = 0;

		do {
			System.out.println("\n\n");
			System.out.println("patinet");
			System.out.println("welcome: " + UIMenu.patientLogged.getName());
			System.out.println("1. book an appoinment");
			System.out.println("2. my appoinments");
			System.out.println("0. logout");
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
			case 1:
				showBookAppoinmentsMenu();
				break;
			case 2:
				showPatientMyAppointments();

				break;
			case 0:
				UIMenu.showMenu();
				break;
			}

		} while (response != 0);
	}

	private static void showBookAppoinmentsMenu() {
		int response = 0;
		do {
			System.out.println("::book and appointment");
			System.out.println("::select date: ");

			// numeraciopn de la lista de fechas
			// indice de la fecha seleccionada
			// [doctors]
			// 1.-docor 1
			// -1 fecha 1
			// -2 fecha 2
			// 2.-doctor 2
			Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
			int k = 0;
			for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppoinmets.size(); i++) {
				ArrayList<Doctor.AvailableAppointment> availableAppointment = UIDoctorMenu.doctorsAvailableAppoinmets
						.get(i).getAvailableAppointments();

				Map<Integer, Doctor> doctorAppoinment = new TreeMap<>();

				for (int j = 0; j < availableAppointment.size(); j++) {
					k++;
					System.out.println(k + ". " + availableAppointment.get(j).getDate());
					doctorAppoinment.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppoinmets.get(i));
					doctors.put(Integer.valueOf(k), doctorAppoinment);
				}

			}

			Scanner sc = new Scanner(System.in);
			int responseDateSelected = Integer.valueOf(sc.nextLine());

			Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
			Integer indexDate = 0;
			Doctor doctorSelected = new Doctor("", "");

			for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
				indexDate = doc.getKey();
				doctorSelected = doc.getValue();
			}

			System.out.println(doctorSelected.getName() + ". Date:"
					+ doctorSelected.getAvailableAppointments().get(indexDate).getDate() + ". Time:"
					+ doctorSelected.getAvailableAppointments().get(indexDate).getTime());

			System.out.println("confirm your appointment \n1. yes \n2 change data");
			response = Integer.valueOf(sc.nextLine());
			if (response == 1) {
				UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,
						doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
						doctorSelected.getAvailableAppointments().get(indexDate).getTime());

				showPatientMenu();
			}

		} while (response != 0);
	}

	private static void showPatientMyAppointments() {
		int response = 0;
		do {
			System.out.println("::my appointments");
			if (UIMenu.patientLogged.getAppointmentNurse().size() == 0) {
				System.out.println("dont have appointments");
			}

			for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
				int j = i + 1;
				System.out.println(j + ". Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()
						+ ". time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() + "\n docor: "
						+ UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()

				);

			}

		} while (response != 0);
	}

}
