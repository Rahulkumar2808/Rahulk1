package pages;

import wrappers.DemoprojWrappers;

public class EditTaskPage extends DemoprojWrappers {

	public EditTaskPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public EditTaskPage enterTaskname(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Taskname.name"), data);
		return this;
	}
	
	public EditTaskPage enterTaskdesc(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Taskndescription.name"), data);
		return this;
	}
	
	public EditTaskPage selectProject(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Project.name"), data);
		return this;
	}
	
	public EditTaskPage selectPriority(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Priority.name"), data);
		return this;
	}
	
	public EditTaskPage selectStatus(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Status.name"), data);
		return this;
	}
	
	public EditTaskPage selectType(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Type.name"), data);
		return this;
	}
	
	public EditTaskPage selectAssignedto(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Assignedto.name"), data);
		return this;
	}
	
	public EditTaskPage enterStartdate(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Startdate.name"), data);
		return this;
	}
	
	public EditTaskPage clickStartdatecalender() throws InterruptedException {
		clickByXpath(prop.getProperty("TaskRecord.Startdatecalender.Xpath"));
		return this;
	}
	
	public EditTaskPage enterFinishdate(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Finishdate.name"), data);
		return this;
	}
	
	public EditTaskPage clickFinishdatecalender() throws InterruptedException {
		clickByXpath(prop.getProperty("TaskRecord.Finishdatecalender.Xpath"));
		return this;
	}
	
	public HomePage clickSubmitbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditTask.Submitbutton.name"));
		return new HomePage();
	}
	
	public HomePage clickDeletebutton() throws InterruptedException {
		clickByName(prop.getProperty("EditTask.Deletebutton.name"));
		return new HomePage();
	}
	
	public HomePage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditTask.Cancelbutton.name"));
		return new HomePage();
	}
}
