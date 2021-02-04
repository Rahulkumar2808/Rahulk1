package pages;

import wrappers.DemoprojWrappers;

public class AddProjectPage extends DemoprojWrappers {

	public AddProjectPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public AddProjectPage enterProjectname(String data) {
		enterByName(prop.getProperty("AddProject.Projectname.name"), data);
		return this;
	}
	public AddProjectPage erDef4() {
		verifyTextByXpath(prop.getProperty("AddEmployee.ErEmployee.xpath="),"Duplicate value");
		return this;
	}
	
	public ProjectListPage clickAddbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddProject.Addbutton.name"));
		return new ProjectListPage();
	}
	
	public ProjectListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddProject.Cancelbutton.name"));
		return new ProjectListPage();
	}
}
