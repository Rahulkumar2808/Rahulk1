package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class adStatusList extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void viewStatus(String loginid,String password) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickStatuseslink()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testCaseName="View Status List";
		testDescription="Check whether user is able to view status list";
	}
}
