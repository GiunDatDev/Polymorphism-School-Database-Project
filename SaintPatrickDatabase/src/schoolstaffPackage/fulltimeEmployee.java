package schoolstaffPackage;

import configPackage.schoolConfig;

public class fulltimeEmployee extends schoolEmployee{
	private int employeeType;

	public fulltimeEmployee(String employeeName, int salary, String gender, String phoneNumber) {
		super(employeeName, gender, phoneNumber);
	}
	
	@Override
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	
	public String getEmployeeType() {
		if (this.employeeType == schoolConfig.SCHOOLPRINCIPLE) {
			return "SCHOOL PRINCIPLE";
		}
		else if (this.employeeType == schoolConfig.TEACHER) {
			return "TEACHER";
		}
		else if (this.employeeType == schoolConfig.LIBARIAN) {
			return "LIBARIAN";
		}
		else if (this.employeeType == schoolConfig.SCHOOLDOCTOR) {
			return "SCHOOL DOCTOR";
		}
		else if (this.employeeType == schoolConfig.CLEANER) {
			return "SCHOOL CLEANER";
		}
		else if (this.employeeType == schoolConfig.GUIDANCE) {
			return "GUIDANCE";
		}
		else if (this.employeeType == schoolConfig.SECURITY) {
			return "SCHOOL SECURITY";
		}
		else {
			return "SYSTEM CAN NOT DEFINE THIS TYPE OF WORKER !!!";
		}
	}
	
	public void findSalary() {
		if (this.employeeType == schoolConfig.SCHOOLPRINCIPLE) {
			salary = schoolConfig.SASCHOOLPRINCIPLE;
		}
		else if (this.employeeType == schoolConfig.TEACHER) {
			salary = schoolConfig.SATEACHER;
		}
		else if (this.employeeType == schoolConfig.LIBARIAN) {
			salary = schoolConfig.SALIBARIAN;
		}
		else if (this.employeeType == schoolConfig.SCHOOLDOCTOR) {
			salary = schoolConfig.SASCHOOLDOCTOR;
		}
		else if (this.employeeType == schoolConfig.CLEANER) {
			salary = schoolConfig.SACLEANER;
		}
		else if (this.employeeType == schoolConfig.GUIDANCE) {
			salary = schoolConfig.SAGUIDANCE;
		}
		else if (this.employeeType == schoolConfig.SECURITY) {
			salary = schoolConfig.SASECURITY;
		}
		else {
			System.out.println("SYSTEM CAN NOT DEFINE THIS TYPE OF WORKER !!!");
		}
	}
}
