package pages;

import wrappers.DemoprojWrappers;

public class EmployeeListPage extends DemoprojWrappers {

	public EmployeeListPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public EmployeeListPage sortByEmployee() throws InterruptedException {
		clickByLink(prop.getProperty("EmployeeList.Employee.link"));
		return this;
	}
	
	public EmployeeListPage sortByLoginID() throws InterruptedException {
		clickByLink(prop.getProperty("EmployeeList.Login.link"));
		return this;
	}
	
	public EmployeeListPage sortByEmail() throws InterruptedException {
		clickByLink(prop.getProperty("EmployeeList.Email.link"));
		return this;
	}
	
	public EmployeeListPage sortBySecuritylevel() throws InterruptedException {
		clickByLink(prop.getProperty("EmployeeList.Securitylevel.link"));
		return this;
	}
	
	public AddEmployeePage clickAddnewemployee() throws InterruptedException {
		clickByLink(prop.getProperty("EmployeeList.Addnewemployee.link"));
		return new AddEmployeePage();
	}
	
	public EmployeeListPage clickNext() throws InterruptedException {
		clickByLink(prop.getProperty("EmployeeList.Next.link"));
		return this;
	}
}
