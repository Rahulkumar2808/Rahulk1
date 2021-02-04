package pages;

import wrappers.DemoprojWrappers;

public class EditPriorityPage extends DemoprojWrappers{

	public EditPriorityPage enterPriorityname(String data) {
		enterByName(prop.getProperty("EditPriority.Priorityname.name"), data);
		return this;
	}
	
	public PriorityListPage clickSubmitbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditPriority.Submitbutton.name"));
		return new PriorityListPage();
	}
	
	public PriorityListPage clickDeletebutton() throws InterruptedException {
		clickByName(prop.getProperty("EditPriority.Deletebutton.name"));
		return new PriorityListPage();
	}
	
	public PriorityListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditPriority.Cancelbutton.name"));
		return new PriorityListPage();
	}
}
