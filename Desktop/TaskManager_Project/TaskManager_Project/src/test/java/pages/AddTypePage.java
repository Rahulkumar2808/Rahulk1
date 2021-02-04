package pages;

import wrappers.DemoprojWrappers;

public class AddTypePage extends DemoprojWrappers {

	public AddTypePage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public AddTypePage enterTypename(String data) {
		enterByName(prop.getProperty("AddType.Typename.name"), data);
		return this;
	}
	public AddTypePage erDef6() {
		verifyTextByXpath(prop.getProperty("AddType.ErAddType.xpath="),"Duplicate value");
		return this;
	}
	
	public TypeListPage clickAddbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddType.Addbutton.name"));
		return new TypeListPage();
	}
	
	public TypeListPage clickCancelbutton() throws InterruptedException {
		clickByName(prop.getProperty("AddType.Cancelbutton.name"));
		return new TypeListPage();
	}
}
