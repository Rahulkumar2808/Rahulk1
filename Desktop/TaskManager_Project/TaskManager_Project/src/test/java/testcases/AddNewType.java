package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class AddNewType extends DemoprojWrappers  {
	@Test(dataProvider="fetchData")
	public void TypeAddition(String loginid,String password,String Type) throws InterruptedException {
		new HomePage()
		.clickAdministrationlinkbeforeLogin()
		.enterLoginID(loginid)
		.enterPassword(password)
		.clickLoginbuttonAdmin()
		.clickTypeslink()
		.clickAddnewtype()
		.enterTypename(Type)
		.clickAddbutton()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="adTypeAddition";
		testCaseName="Add New Type";
		testDescription="Check whether user is able to add new type successfully";
	}
}
