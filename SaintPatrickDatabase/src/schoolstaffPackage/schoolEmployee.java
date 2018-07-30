package schoolstaffPackage;

public class schoolEmployee {
	protected String employeeName;
	protected int salary;
	protected String gender;
	protected String phoneNumber;
	
	public schoolEmployee(String employeeName, String gender, String phoneNumber) {
		super();
		this.employeeName = employeeName;
		this.salary = 0;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmployeeType(int employeeType) {
		
	}
	
	public String getEmployeeType() {
		return "NOTHING IS SET";		
	}
	
	public void findSalary() {
		
	}
	
	public void showInfo() {
		System.out.println("==== Employee name: " + employeeName + " ====");
		System.out.println(">>> Type of work: " + getEmployeeType());
		System.out.println(">>> Employee gender: " + gender);
		System.out.println(">>> Employee phone number: " + phoneNumber);
		System.out.println(">>> Salary: " + salary) ;
		System.out.println("\n\n");
	}
}
