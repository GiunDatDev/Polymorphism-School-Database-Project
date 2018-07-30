package mainPackage;
import java.util.Scanner;

import configPackage.schoolConfig;
import schoolstaffPackage.fulltimeEmployee;
import schoolstaffPackage.parttimeEmployee;
import schoolstaffPackage.schoolEmployee;
import studentPackage.saintPatrickStudent;
import studentPackage.schoolStudent;

public class mainClass {	
	public static void makeDatabase(int staffNum, int studentNum) {
		Scanner usr_in = new Scanner(System.in);
		schoolStudent[] student = new schoolStudent[studentNum];
		schoolEmployee[] employee = new schoolEmployee[staffNum];
		
		for (int counter = 0; counter < staffNum; ++counter) {
			System.out.println("Type of school staff: ");
			String employeeType = usr_in.nextLine();
			
			if (employeeType.equals("Fulltime")) {
				System.out.println("Employee name: ");
				String name = usr_in.nextLine();
				System.out.println("Employee gender: ");
				String gender = usr_in.nextLine();
				System.out.println("Employee phone number: ");
				String phoneNumber = usr_in.nextLine();
				System.out.println("Employee occupation ???\n1--School principle\n2--Teacher\n3--Guidance\n4--School doctor\n5--Libarian\n6--Security\n7--Cleaner\n8--Trainer");
				int employeeOccupation = Integer.parseInt(usr_in.nextLine());
				employee[counter] = new fulltimeEmployee(name, 0, gender, phoneNumber);
				
				// Set employee occupation and find the average salary
				employee[counter].setEmployeeType(employeeOccupation);
				employee[counter].findSalary();
			}
			else if (employeeType.equals("Parttime")) {
				System.out.println("Employee name: ");
				String name = usr_in.nextLine();
				System.out.println("Employee gender: ");
				String gender = usr_in.nextLine();
				System.out.println("Employee phone number: ");
				String phoneNumber = usr_in.nextLine();
				System.out.println("Working hours: ");
				int workingHour = Integer.parseInt(usr_in.nextLine());
				employee[counter] = new parttimeEmployee(name, gender, phoneNumber, workingHour);
				
				// Set employee occupation and find the average salary
				employee[counter].getEmployeeType();
				employee[counter].findSalary();
			}
		}
		
		for (int counter = 0; counter < studentNum; ++counter) {
			System.out.println("Student name: ");
			String name = usr_in.nextLine();
			System.out.println("Student gender: ");
			String gender = usr_in.nextLine();
			System.out.println("Student ID");
			String studentId = usr_in.nextLine();
			System.out.println("Student status: ");
			String status = usr_in.nextLine();
			System.out.println("Student grade: ");
			int studentLevel = Integer.parseInt(usr_in.nextLine());
			System.out.println("Student average result: ");
			int result =  Integer.parseInt(usr_in.nextLine());
			System.out.println("Type of student ???\n1--International student\n2--Native student");
			int studentType = Integer.parseInt(usr_in.nextLine());
			student[counter] = new saintPatrickStudent(name, gender, studentId, status, studentLevel, result);
			
			// Determine if the student is capable of taking the scholarship or not
			if (studentType == 1) {
				student[counter].setStudentType(schoolConfig.INTERNATIONALSTUDENT);
			}
			else if (studentType == 2) {
				student[counter].setStudentType(schoolConfig.NATIVESTUDENT);
			}
			student[counter].scholarshipCap();
		}
		
		for (schoolEmployee saintPatemployee : employee) {
			saintPatemployee.showInfo();
		}
		
		for (schoolStudent saintPatstudent : student) {
			saintPatstudent.showStudentInfo();
		}
	}
	
	public static void main(String args[]) {
		Scanner usr_in = new Scanner(System.in);
		System.out.println("==== SAINT PATRICK DATABASE SYSTEM ====");
		
		System.out.println("Enter the number of staff: ");
		int schoolStaff = Integer.parseInt(usr_in.nextLine());
		System.out.println("Enter the number of student: ");
		int schoolStudent = Integer.parseInt(usr_in.nextLine());
		
		makeDatabase(schoolStaff, schoolStudent);
	}
}
