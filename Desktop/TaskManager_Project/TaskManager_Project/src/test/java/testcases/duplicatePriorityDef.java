package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class duplicatePriorityDef extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void PriorityAddition(String loginid,String password,String priority) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickPrioritieslink()
		.clickAddnewpriority()
		.enterPriorityname(priority)
		.erDef2()
		.clickAddbutton()
		;
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="adPriorityAddition";
		testCaseName="Add New Priority";
		testDescription="Check whether user is not able to add new Priority with duplicate values ";
	}
}
