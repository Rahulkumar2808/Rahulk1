package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;

import wrappers.DemoprojWrappers;

public class adAdminLogout extends DemoprojWrappers  {
	@Test(dataProvider="fetchData")
	public void logout(String loginid,String password) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickLogoutlink()
		;
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testCaseName="Verify the Logout functionality";
		testDescription="Check whether user is able to logout successfully";
	}
}
