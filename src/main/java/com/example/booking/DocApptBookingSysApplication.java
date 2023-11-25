package com.example.booking;
import java.util.Calendar;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocApptBookingSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocApptBookingSysApplication.class, args);
	}

}
class Doctor {
	//Attributes (doctorId, name, specialization)
	private String doctorID;
	private String name;
	private String specialization;

	//Constructor Doctor(attributes)
	public Doctor(String doctorID, String name, String specialization){
		this.doctorID = doctorID;
		this.name = name;
		this.specialization = specialization;
	}
	//Getters and setters
	public String getDoctorID(){
		return doctorID;
	}
	public String getName(){
		return name;
	}
	public String getSpecialization(){
		return specialization;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	//Methods (void login(), boolean validate() numValid(), viewAppointmentsForDay(String date),
	// viewPatientHistory(String patientId)
	public void viewAppointmentsForDay(String date){
		//make appointment data to access
		String file = "Appointments.txt";
		// retrieve and display appointments for doctor on the given date

		//display relevant information to the doctor
	}
	public void viewPatientAppointmentHistory(String patientId){
		//retrieve and display appointment history of patient for this doctor
		//access appointment data
		//display relevant information to the doctor
	}
	public void updatePersonalInformation(String newName, String newSpecialization){
		//update doctors name and specialization
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter new name:");
			String newName = obj.nextLine();
			while (!stringValid(newName) || newName == "") {
				System.out.println("Enter valid name please");
				newName = obj.nextLine();
			}

		System.out.println("Enter your Specialization: ");
		String Specialization = obj.nextLine();
		while (!stringValid(Specialization) || Specialization == "") {
			System.out.println("Enter valid Specialization please");
			Specialization = obj.nextLine();
		}
	}
}

class Patient{
	//Attributes (patientId, name, email)
	private String patientId;
	private String name;
	private String email;

	//Constructor Patient(attributes)
	public Patient(String patientId,String name, String email){
		this.patientId;
		this.name;
		this.email;
	}

	//Getters and setters (attributes)
	public String getPatientId(){
		return patientId;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	//Methods (view Appointments, bookAppointments, cancelAppointment, rescheduleAppointment,
	// login, registration, patientMenu, string/numValidation)
}

class Administration{
	//Attributes (AdminId, name)
	private String adminId;
	private String name;
	//Constructor Administration(attributes)
	public Administration(String adminId, String name){
		this.adminId;
		this.name;
	}
	//Getters and setters
	public String getName(){
		return name;
	}
	public String getAdminId() {
		return adminId;
	}
	//Methods (login, adminMenu, viewAppointmentsForDay, viewAllPatients, viewDoctorSchedule
	// patientProfileCreation, schedule/cancel/rescheduleAppointments)

}