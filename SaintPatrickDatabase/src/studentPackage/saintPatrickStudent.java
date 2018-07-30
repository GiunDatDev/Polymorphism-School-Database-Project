package studentPackage;
import configPackage.schoolConfig;

public class saintPatrickStudent extends schoolStudent{
	private int studentType;
	
	public saintPatrickStudent(String studentName, String gender, String studentId, String status, int studentLevel,
			int studentResult) {
		super(studentName, gender, studentId, status, studentLevel, studentResult);
	}
	
	@Override
	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}
	
	public String getStudentType() {
		if (studentType == schoolConfig.INTERNATIONALSTUDENT) {
			return "INTERNATIONAL STUDENT";
		}
		else if (studentType == schoolConfig.NATIVESTUDENT) {
			return "NATIVE STUDENT";
		}
		else {
			return "SYSTEM CAN NOT DEFINE THE STUDENT TYPE";
		}
	}	
}
