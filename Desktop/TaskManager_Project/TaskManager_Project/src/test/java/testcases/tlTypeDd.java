package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlTypeDd extends DemoprojWrappers{
	@Test(dataProvider="fetchData")
	public void verifyType(String type) throws InterruptedException {
		new HomePage()
		.selectType(type)
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="tlTypeDd";
		testCaseName="Verify type dopdown";
		testDescription="Check whether user is able to select type form type dropdown";
	}
}
