package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlSortPriority extends DemoprojWrappers {
	@Test
	public void sortPriority() throws InterruptedException {
		new HomePage()
		.sortbyPriority()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="";
		testCaseName="Verify the sorting in Task list";
		testDescription="Check whether user is able to sort the task list using Priority ";
	}
}
