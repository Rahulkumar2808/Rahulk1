package pages;

import wrappers.DemoprojWrappers;

public class AddEmployeePage extends DemoprojWrappers {

	public AddEmployeePage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public AddEmployeePage enterEmployeename(String data) {
		enterByName(prop.getProperty("AddEmployee.Employeename.name"), data);
		return this;
	}
	
	public AddEmployeePage enterEmail(String data) {
		enterByName(prop.getProperty("AddEmployee.Email.name"), data);
		return this;
	}
	
	public AddEmployeePage enterLoginID(String data) {
		enterByName(prop.getProperty("AddEmployee.LoginID.name"), data);
		return this;
	}
	
	public AddEmployeePage enterPassword(String data) {
		enterByName(prop.getProperty("AddEmployee.Password.name"), data);
		return this;
	}
	
	public AddEmployeePage selectSecuritylevel(String data) {
		selectByName(prop.getProperty("AddEmployee.Securitylevel.name"), data);
		return this;
	}
	public AddEmployeePage erDef3() {
		verifyTextByXpath(prop.getProperty("AddEmployee.ErEmployee.xpath="),"Duplicate value");
		return this;
	}
	
	public EmployeeListPage clickAddbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddEmployee.Addbutton.name"));
		return new EmployeeListPage();
	}
	
	public EmployeeListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddEmployee.Cancelbutton.name"));
		return new EmployeeListPage();
	}
}
