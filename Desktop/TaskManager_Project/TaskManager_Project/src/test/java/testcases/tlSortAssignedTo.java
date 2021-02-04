package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlSortAssignedTo extends DemoprojWrappers{
	@Test
	public void sortAssignedTo() throws InterruptedException {
		new HomePage()
		.sortbyassignedto()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="";
		testCaseName="Verify the sorting in Task list";
		testDescription="Check whether user is able to sort the task list using assigned to ";
	}
}
