package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class AddNewPriority extends DemoprojWrappers {
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
		.clickAddbutton()
		;
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="adPriorityAddition";
		testCaseName="Add New Priority";
		testDescription="Check whether user is able to add new Priority successfully";
	}
	
	

}
