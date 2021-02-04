package pages;

import wrappers.DemoprojWrappers;

public class AddPriorityPage extends DemoprojWrappers {

	public AddPriorityPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public AddPriorityPage enterPriorityname(String data) {
		enterByName(prop.getProperty("AddPriority.Priorityname.name"), data);
		return this;
	}
	public AddPriorityPage erDef2() throws InterruptedException {
		verifyTextByXpath(prop.getProperty("AddPriority.ErPriority.xpath"),"Duplicate vlue");
		return new AddPriorityPage();
	}
	
	public PriorityListPage clickAddbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddPriority.Addbutton.name"));
		return new PriorityListPage();
	}
	
	public PriorityListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddPriority.Cancelbutton.name"));
		return new PriorityListPage();
	}
}
