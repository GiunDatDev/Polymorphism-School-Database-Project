package schoolstaffPackage;
import configPackage.schoolConfig;

public class parttimeEmployee extends schoolEmployee{
	private int workingHour;
	private int employeeType;

	public parttimeEmployee(String employeeName, String gender, String phoneNumber, int workingHour) {
		super(employeeName, gender, phoneNumber);
		this.workingHour = workingHour;
	}
	
	@Override
	public String getEmployeeType() {
		return "TRAINER";
	}
	
	public void findSalary() {
		salary = schoolConfig.SATRAINER * workingHour;
	}
}
