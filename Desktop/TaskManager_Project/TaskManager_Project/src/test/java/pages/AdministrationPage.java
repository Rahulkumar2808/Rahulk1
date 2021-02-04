package pages;

import wrappers.DemoprojWrappers;

public class AdministrationPage extends DemoprojWrappers {

	public AdministrationPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public EmployeeListPage clickEmployeeslink() throws InterruptedException {
		clickByLink(prop.getProperty("Administration.Employees.link"));
		return new EmployeeListPage();
	}
	
	public PriorityListPage clickPrioritieslink() throws InterruptedException {
		clickByLink(prop.getProperty("Administration.Priorities.link"));
		return new PriorityListPage();
	}
	
	public ProjectListPage clickProjectslink() throws InterruptedException {
		clickByLink(prop.getProperty("Administration.Projects.link"));
		return new ProjectListPage();
	}
	
	public StatusListPage clickStatuseslink() throws InterruptedException {
		clickByLink(prop.getProperty("Administration.Statuses.link"));
		return new StatusListPage();
	}
	
	public TypeListPage clickTypeslink() throws InterruptedException {
		clickByLink(prop.getProperty("Administration.Types.link"));
		return new TypeListPage();
	}
	public LoginPage clickLogoutlink() throws InterruptedException {
		clickByLink(prop.getProperty("Administration.Logout.link"));
		return new LoginPage();
	}
}
