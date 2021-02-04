package pages;

import wrappers.DemoprojWrappers;

public class TaskRecordPage extends DemoprojWrappers {

	public TaskRecordPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public TaskRecordPage enterTaskname(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Taskname.name"), data);
		return this;
	}
	
	public TaskRecordPage enterTaskdesc(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Taskdescription.name"), data);
		return this;
	}
	
	public TaskRecordPage selectProject(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Project.name"), data);
		return this;
	}
	
	public TaskRecordPage selectPriority(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Priority.name"), data);
		return this;
	}
	
	public TaskRecordPage selectStatus(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Status.name"), data);
		return this;
	}
	
	public TaskRecordPage selectType(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Type.name"), data);
		return this;
	}
	
	public TaskRecordPage selectAssignedto(String data) throws InterruptedException {
		selectByName(prop.getProperty("TaskRecord.Assignedto.name"), data);
		return this;
	}
	
	public TaskRecordPage enterStartdate(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Startdate.name"), data);
		return this;
	}
	
	public TaskRecordPage clickStartdatecalender() throws InterruptedException {
		clickByXpath(prop.getProperty("TaskRecord.Startdatecalender.Xpath"));
		return this;
	}
	
	public TaskRecordPage enterFinishdate(String data) throws InterruptedException {
		enterByName(prop.getProperty("TaskRecord.Finishdate.name"), data);
		return this;
	}
	public TaskRecordPage erDef1() throws InterruptedException {
		verifyTextByXpath(prop.getProperty("Home.ErDate.xpath"),"Start date should not exceed end date");
		return new TaskRecordPage();
	}
	public TaskRecordPage clickFinishdatecalender() throws InterruptedException {
		clickByXpath(prop.getProperty("TaskRecord.Finishdatecalender.Xpath"));
		return this;
	}
	
	public HomePage clickAddbutton() throws InterruptedException {
		clickByName(prop.getProperty("TaskRecord.Addbutton.name"));
		return new HomePage();
	}
	
	public HomePage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("TaskRecord.Cancelbutton.name"));
		return new HomePage();
	}
	
	
}
