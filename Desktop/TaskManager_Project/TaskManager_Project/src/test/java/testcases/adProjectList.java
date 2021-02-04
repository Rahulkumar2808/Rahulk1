package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class adProjectList extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void viewProject(String loginid,String password) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickProjectslink()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testCaseName="View Project List";
		testDescription="Check whether user is able to view project list";
	}
}
