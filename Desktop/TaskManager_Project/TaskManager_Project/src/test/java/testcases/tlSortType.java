package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.DemoprojWrappers;

public class tlSortType extends DemoprojWrappers {
	@Test
	public void sortType() throws InterruptedException {
		new HomePage()
		.sortbyType()
		;

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="";
		testCaseName="Verify the sorting in Task list";
		testDescription="Check whether user is able to sort the task list using type";
	}
}

