package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlSortFinishDate extends DemoprojWrappers {
	@Test
	public void sortFinishDate() throws InterruptedException {
		new HomePage()
		.sortbyFinishdate()
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="";
		testCaseName="Verify the sorting in Task list";
		testDescription="Check whether user is able to sort the task list using Finish Date";
	}
}
