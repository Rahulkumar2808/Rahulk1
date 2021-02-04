package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class AddTaskDef extends DemoprojWrappers {
	@Test(dataProvider="fetchData") 
	public void TaskAdditionInvalidData(String loginid,String password,String task,String desp,String startdate,String Finishdate,String project,String priority,String status, String type, String assigned  ) throws InterruptedException {

		new HomePage()
		.clickAddtasklinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
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
		.erDef1()
		.clickAddbutton()
		
		;

		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="AddTaskInvalid";
		testCaseName="Add Task with invalid values";
		testDescription="Check whether user is not able to add task successfully";
	}

}
