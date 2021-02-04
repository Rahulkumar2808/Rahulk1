package pages;

import wrappers.DemoprojWrappers;

public class TypeListPage extends DemoprojWrappers {

	public TypeListPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}
	
	public TypeListPage sortByType() throws InterruptedException {
		clickByLink(prop.getProperty("TypeList.Type.link"));
		return this;
	}
	
	public AddTypePage clickAddnewtype() throws InterruptedException {
		clickByLink(prop.getProperty("TypeList.Addnewtype.link"));
		return new AddTypePage();
	}
}
