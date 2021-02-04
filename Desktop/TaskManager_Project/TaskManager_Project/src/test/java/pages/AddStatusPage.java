package pages;

import wrappers.DemoprojWrappers;

public class AddStatusPage extends DemoprojWrappers {

	public AddStatusPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public AddStatusPage enterStatusname(String data) {
		enterByName(prop.getProperty("AddStatus.Statusname.name"), data);
		return this;
	}
	public AddStatusPage erDef5() {
		verifyTextByXpath(prop.getProperty("AddStatus.ErStatus.xpath="),"Duplicate value");
		return this;
	}
	
	public StatusListPage clickAddbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddStatus.Addbutton.name"));
		return new StatusListPage();
	}
	
	public StatusListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddStatus.Cancelbutton.name"));
		return new StatusListPage();
	}
}
