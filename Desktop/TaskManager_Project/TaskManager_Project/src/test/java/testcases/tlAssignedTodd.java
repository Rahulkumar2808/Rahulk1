package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlAssignedTodd extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void verifyAssignedTo(String assigned) throws InterruptedException {
		new HomePage()
		.selectAssignedto(assigned)
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="tlAssignedDd";
		testCaseName="verify AssignedTo dropdown";
		testDescription="Check whether user is able to select employee from assigned To dropdown";
	}
}
