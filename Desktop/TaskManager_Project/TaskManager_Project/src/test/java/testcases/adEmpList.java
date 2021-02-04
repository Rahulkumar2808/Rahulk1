package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class adEmpList extends DemoprojWrappers {
//fl=field level clicking on employee link in administration page
	@Test(dataProvider="fetchData")
	public void viewEmployee(String loginid,String password) throws InterruptedException {

		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickEmployeeslink()
		;
		

	}

	@BeforeClass
	public void beforeClass() {
		dataSheetName="Login";
		testCaseName="View Employee List";
		testDescription="Check whether user is able to view employee list";
	}
}
