package pages;

import wrappers.DemoprojWrappers;

public class StatusListPage extends DemoprojWrappers {

	public StatusListPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public StatusListPage sortByStatus() throws InterruptedException {
		clickByLink(prop.getProperty("StatusList.Status.link"));
		return this;
	}
	
	public AddStatusPage clickAddnewStatus() throws InterruptedException {
		clickByLink(prop.getProperty("StatusList.Addnewstatus.link"));
		return new AddStatusPage();
	}
}
