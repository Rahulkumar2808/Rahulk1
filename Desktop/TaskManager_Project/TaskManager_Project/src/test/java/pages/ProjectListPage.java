package pages;

import wrappers.DemoprojWrappers;

public class ProjectListPage extends DemoprojWrappers {

	public ProjectListPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public ProjectListPage sortByProject() throws InterruptedException {
		clickByLink(prop.getProperty("ProjectList.Project.link"));
		return this;
	}
	
	public AddProjectPage clickAddnewproject() throws InterruptedException {
		clickByLink(prop.getProperty("ProjectList.Addnewproject.link"));
		return new AddProjectPage();
	}
}
