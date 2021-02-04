package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class AddNewEmployee extends DemoprojWrappers {
	@Test(dataProvider="fetchData")
	public void employeeAddition(String loginid,String password,String name,String email,String login,String pass,String security) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickEmployeeslink()
		.clickAddnewemployee()
		.enterEmployeename(name)
		.enterEmail(email)
		.enterLoginID(login)
		.enterPassword(pass)
		.selectSecuritylevel(security)
		.clickAddbutton()
		
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="adEmployeeAddition";
		testCaseName="Add New Employees";
		testDescription="Check whether user is able to Add new Employees in administration successfully";
	}

}
