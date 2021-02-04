package pages;

import wrappers.DemoprojWrappers;

public class PriorityListPage extends DemoprojWrappers {

	public PriorityListPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public PriorityListPage sortByPriority() throws InterruptedException {
		clickByLink(prop.getProperty("PriorityList.Priority.link"));
		return this;
	}
	
	public AddPriorityPage clickAddnewpriority() throws InterruptedException {
		clickByLink(prop.getProperty("PriorityList.Addnewpriority.link"));
		return new AddPriorityPage();
	}
}
