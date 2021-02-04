package pages;

import wrappers.DemoprojWrappers;

public class EditProjectPage extends DemoprojWrappers{

	public EditProjectPage enterProjectname(String data) {
		enterByName(prop.getProperty("EditProject.Projectname.name"), data);
		return this;
	}
	
	public ProjectListPage clickSubmitbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditProject.Submitbutton.name"));
		return new ProjectListPage();
	}
	
	public ProjectListPage clickDeletebutton() throws InterruptedException {
		clickByName(prop.getProperty("EditProject.Deletebutton.name"));
		return new ProjectListPage();
	}
	
	public ProjectListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditProject.Cancelbutton.name"));
		return new ProjectListPage();
	}
}
