package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class duplicateProjectDef extends DemoprojWrappers {
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
		.erDef4()
		.clickAddbutton()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="adProjectAddititon";
		testCaseName="Add New Project";
		testDescription="Check whether user is not able to add new PROJECT with duplicate values";
	}

}
