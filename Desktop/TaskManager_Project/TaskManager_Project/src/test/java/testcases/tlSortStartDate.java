package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlSortStartDate extends DemoprojWrappers{
	@Test
	public void sortStartDate() throws InterruptedException {
		new HomePage()
		.sortbyStartdate()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="";
		testCaseName="Verify the sorting in Task list";
		testDescription="Check whether user is able to sort the task list using StartDate";
	}
}
