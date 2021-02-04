package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlProjectDd extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void verifyProject(String project) throws InterruptedException {
		new HomePage()
		.selectProject(project)
		
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="tlProjectDd";
		testCaseName="Verify PROJECT dropdown";
		testDescription="Check whether user is able to select project from the dropdown";
	}
}
