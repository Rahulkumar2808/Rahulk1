package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class adTypeList extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void viewType(String loginid,String password) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickTypeslink()
		
		;
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testCaseName="View Types List";
		testDescription="Check whether user is able to view type list";
	}
}
