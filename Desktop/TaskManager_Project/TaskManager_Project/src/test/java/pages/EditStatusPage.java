package pages;

import wrappers.DemoprojWrappers;

public class EditStatusPage extends DemoprojWrappers{

	public EditStatusPage enterStatusname(String data) {
		enterByName(prop.getProperty("EditStatus.Statusname.name"), data);
		return this;
	}
	
	public StatusListPage clickSubmitbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditStatus.Submitbutton.name"));
		return new StatusListPage();
	}
	
	public StatusListPage clickDeletebutton() throws InterruptedException {
		clickByName(prop.getProperty("EditStatus.Deletebutton.name"));
		return new StatusListPage();
	}
	
	public StatusListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditStatus.Cancelbutton.name"));
		return new StatusListPage();
	}
}
