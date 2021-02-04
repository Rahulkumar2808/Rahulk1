package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class AddNewProject extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void ProjectAddition(String loginid,String password,String projectname) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickProjectslink()
		.clickAddnewproject()
		.enterProjectname(projectname)
		.clickAddbutton()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="adProjectAddition";
		testCaseName="Add New Project";
		testDescription="Check whether user is able to add new PROJECT successfully";
	}

}
