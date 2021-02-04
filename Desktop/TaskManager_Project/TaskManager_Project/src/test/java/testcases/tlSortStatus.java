package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlSortStatus extends DemoprojWrappers {
	@Test
	public void sortStatus() throws InterruptedException {
		new HomePage()
		.sortStatus()//sort status in ascending order
		.sortStatus()//sort status in descending order
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="";
		testCaseName="Verify the sorting in Task list";
		testDescription="Check whether user is able to sort the task list using Status";
	}
}
