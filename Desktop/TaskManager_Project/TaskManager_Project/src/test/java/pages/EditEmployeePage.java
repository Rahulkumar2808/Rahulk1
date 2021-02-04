package pages;

import wrappers.DemoprojWrappers;

public class EditEmployeePage extends DemoprojWrappers {

	public EditEmployeePage enterEmployeename(String data) {
		enterByName(prop.getProperty("EditEmployee.Employeename.name"), data);
		return this;
	}
	
	public EditEmployeePage enterEmail(String data) {
		enterByName(prop.getProperty("EditEmployee.Email.name"), data);
		return this;
	}
	
	public EditEmployeePage enterLoginID(String data) {
		enterByName(prop.getProperty("EditEmployee.LoginID.name"), data);
		return this;
	}
	
	public EditEmployeePage enterPassword(String data) {
		enterByName(prop.getProperty("EditEmployee.Password.name"), data);
		return this;
	}
	
	public EditEmployeePage selectSecuritylevel(String data) {
		selectByName(prop.getProperty("EditEmployee.Securitylevel.name"), data);
		return this;
	}
	
	public EmployeeListPage clickSubmitbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditEmployee.Submitbutton.name"));
		return new EmployeeListPage();
	}
	
	public EmployeeListPage clickDeletebutton() throws InterruptedException {
		clickByName(prop.getProperty("EditEmployee.Deletebutton.name"));
		return new EmployeeListPage();
	}
	
	public EmployeeListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditEmployee.Cancelbutton.name"));
		return new EmployeeListPage();
	}
}
