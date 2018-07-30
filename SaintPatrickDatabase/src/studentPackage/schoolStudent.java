package studentPackage;

import configPackage.schoolConfig;

public class schoolStudent {
	protected String studentName;
	protected String gender;
	protected String studentId;
	protected String status;
	protected int studentLevel;
	protected int studentResult;
	protected int scholarshipPrice = 0;
	
	public schoolStudent(String studentName, String gender, String studentId, String status, int studentLevel, int studentResult) {
		super();
		this.studentName = studentName;
		this.gender = gender;
		this.studentId = studentId;
		this.status = status;
		this.studentLevel = studentLevel;
		this.studentResult = studentResult;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(int studentLevel) {
		this.studentLevel = studentLevel;
	}
	
	public void setStudentResult(int studentResult) {
		this.studentResult = studentResult;
	}
	
	public double getStudentResult() {
		return this.studentResult;
	}
	
	public void setStudentType(int studentType) {
		
	}
	
	public String getStudentType() {
		return "SYSTEM CAN NOT DEFINE THE STUDENT TYPE";
	}
	
	public void scholarshipCap() {
		if (studentLevel == 12 && studentResult > 95) {
			scholarshipPrice = schoolConfig.FULLSCHOLARSHIP;
		}
		else if (studentLevel == 12 && studentResult >= 80 && studentResult < 95) {
			scholarshipPrice = schoolConfig.SEMSCHOLARSHIP;
		}
	}
	
	public void showStudentInfo() {
		System.out.println("==== Name of student: " + studentName + " ====");
		System.out.println("Student type: " + getStudentType());
		System.out.println(">>> Student gender: " + gender);
		System.out.println(">>> Student ID: " + studentId);
		System.out.println(">>> Student status: " + status);
		System.out.println(">>> Student grade: " + studentLevel);
		System.out.println(">>> Student result: " + studentResult);
		System.out.println(">>> Schoolarship ammount: " + scholarshipPrice);
		System.out.println("\n\n");
	}
}
