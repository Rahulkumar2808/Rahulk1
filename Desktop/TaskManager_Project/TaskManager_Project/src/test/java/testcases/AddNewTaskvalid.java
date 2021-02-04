package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class AddNewTaskvalid extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void TaskAdditionValidData(String login,String pass,String task,String desp,String startdate,String Finishdate,String project,String priority,String status, String type, String assigned) throws InterruptedException {
		new HomePage()
		.clickAddnewtaskbeforeLogin()
		.enterLoginID(login)
		.enterPassword(pass)
		.clickLoginbuttonAddtask()
		.enterTaskname(task)
		.enterTaskdesc(desp)
		.selectPriority(priority)
		.selectProject(project)
		.selectStatus(status)
		.selectType(type)
		.selectAssignedto(assigned)
		.enterStartdate(startdate)
		.enterFinishdate(Finishdate)
		.clickAddbutton()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="AddTaskValid";
		testCaseName="Add Task with valid values";
		testDescription="Check whether user is able to add task successfully";
	}
}
