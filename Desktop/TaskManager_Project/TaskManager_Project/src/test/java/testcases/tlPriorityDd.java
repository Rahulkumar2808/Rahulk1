package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlPriorityDd extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void verifyPriority(String priority) throws InterruptedException {
		new HomePage()
		.selectPriority(priority)
		
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="tlPriorityDd";
		testCaseName="Verify priority dropdown";
		testDescription="Check whether user is able to select priority from the dropdown";
	}
}
