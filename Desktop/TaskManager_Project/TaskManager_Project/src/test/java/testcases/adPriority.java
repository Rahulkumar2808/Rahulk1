package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class adPriority extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void viewPriority(String loginid,String password) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickPrioritieslink()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testCaseName="View Priority List";
		testDescription="Check whether user is able to view priority list";
	}
}
