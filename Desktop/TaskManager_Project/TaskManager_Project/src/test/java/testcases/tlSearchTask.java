package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlSearchTask extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void verifySearchTaskValidData(String assigned,String project,String priority,String status,String type ) throws InterruptedException {
		new HomePage()
		.selectAssignedto(assigned)
		.selectPriority(priority)
		.selectProject(project)
		.selectStatus(status)
		.selectType(type)
		.clickSearchbutton()
		
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="tlSearchVerification";
		testCaseName="Search functionality of Task List page";
		testDescription="Check whether user is able to search desired result";
	}

}
