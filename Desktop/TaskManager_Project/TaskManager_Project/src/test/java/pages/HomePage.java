package pages;

import wrappers.DemoprojWrappers;

public class HomePage extends DemoprojWrappers {

	public HomePage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public HomePage clickTasklistlink() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Tasklistlink.Xpath"));
		return this;
	}
	
	public TaskRecordPage clickAddnewtask() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Addnewtask.link"));
		return new TaskRecordPage();
	}
	
	public LoginPage clickAddnewtaskbeforeLogin() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Addnewtask.link"));
		return new LoginPage();
	}
	
	public TaskRecordPage clickAddtasklink() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Addtasklink.Xpath"));
		return new TaskRecordPage();
	}
	
	public LoginPage clickAddtasklinkbeforeLogin() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Addtasklink.Xpath"));
		return new LoginPage();
	}
	
	public AdministrationPage clickAdministrationlink() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Administrationlink.Xpath"));
		return new AdministrationPage();
	}
	
	public LoginPage clickAdministrationlinkbeforeLogin() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Administrationlink.Xpath"));
		return new LoginPage();
	}
	
	public HomePage selectProject(String data) throws InterruptedException {
		selectByName(prop.getProperty("Home.Project.name"), data);
		return this;
	}
	
	public HomePage selectPriority(String data) throws InterruptedException {
		selectByName(prop.getProperty("Home.Priority.name"), data);
		return this;
	}
	
	public HomePage selectStatus(String data) throws InterruptedException {
		selectByName(prop.getProperty("Home.Status.name"), data);
		return this;
	}
	
	public HomePage selectType(String data) throws InterruptedException {
		selectByName(prop.getProperty("Home.Type.name"), data);
		return this;
	}
	
	public HomePage selectAssignedto(String data) throws InterruptedException {
		selectByName(prop.getProperty("Home.Assignedto.name"), data);
		return this;
	}
	
	public HomePage clickSearchbutton() throws InterruptedException {
		clickByName(prop.getProperty("Home.Searchbutton.name"));
		return this;
	}
	
	public HomePage sortbyTask() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Task.link"));
		return this;
	}
	public HomePage sortbyassignedto() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Assignedto.link"));
		return this;
	}
	
	public HomePage sortbyProject() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Project.link"));
		return this;
	}
	
	public HomePage sortbyPriority() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Priority.link"));
		return this;
	}
	
	public HomePage sortStatus() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Status.link"));
		return this;
	}
	
	public HomePage sortbyType() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Type.link"));
		return this;
	}
	
	public HomePage sortbyStartdate() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Startdate.link"));
		return this;
	}
	
	public HomePage sortbyFinishdate() throws InterruptedException {
		clickByLink(prop.getProperty("Home.Finishdate.link"));
		return this;
	}
	
}
