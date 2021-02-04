package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class duplicateStatusDef extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void StatusAddititon(String loginid,String password,String status) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickStatuseslink()
		.clickAddnewStatus()
		.enterStatusname(status)
		.erDef5()
		.clickAddbutton()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="adStatusAddition";
		testCaseName="Add New Status";
		testDescription="Check whether user is not able to add new status with duplicate values";
	}
}

