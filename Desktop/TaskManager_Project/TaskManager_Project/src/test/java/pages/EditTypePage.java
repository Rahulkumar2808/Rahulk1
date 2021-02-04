package pages;

import wrappers.DemoprojWrappers;

public class EditTypePage extends DemoprojWrappers{

	public EditTypePage enterTypename(String data) {
		enterByName(prop.getProperty("EditType.Typename.name"), data);
		return this;
	}
	
	public TypeListPage clickSubmitbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditType.Submitbutton.name"));
		return new TypeListPage();
	}
	
	public TypeListPage clickDeletebutton() throws InterruptedException {
		clickByName(prop.getProperty("EditType.Deletebutton.name"));
		return new TypeListPage();
	}
	
	public TypeListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("EditType.Cancelbutton.name"));
		return new TypeListPage();
	}
}
