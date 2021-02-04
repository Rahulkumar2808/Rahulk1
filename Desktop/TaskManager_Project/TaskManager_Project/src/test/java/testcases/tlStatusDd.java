package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlStatusDd extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void verifyStatus(String status) throws InterruptedException {
		new HomePage()
		.selectStatus(status)
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="tlStatusDd";
		testCaseName="Verify status dropdown";
		testDescription="Check whether user is able to select status from the dropdown";
	}
}
