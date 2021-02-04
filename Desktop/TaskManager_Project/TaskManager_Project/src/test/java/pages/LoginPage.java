package pages;

import wrappers.DemoprojWrappers;

public class LoginPage extends DemoprojWrappers {

	public LoginPage() throws InterruptedException {
		//if(!verifyTitle("ProField System Login"));
			//Reporter.reportStep("This is not the ProField System Login", "FAIL");
		//Thread.sleep(5000);
	}

	public LoginPage enterLoginID(String data) {
		enterByName(prop.getProperty("Login.LoginID.name"), data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		enterByName(prop.getProperty("Login.Password.name"), data);
		return this;
	}
	
	public AdministrationPage clickLoginbuttonAdmin() throws InterruptedException {
		clickByName(prop.getProperty("Login.Loginbutton.name"));
		return new AdministrationPage();
	}
	
	public TaskRecordPage clickLoginbuttonAddtask() throws InterruptedException {
		clickByName(prop.getProperty("Login.Loginbutton.name"));
		return new TaskRecordPage();
	}
}
