package in.stepdefinition;

import org.utilities.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {
	
	@Before
	public void browserLaunch() {
		setup();


	}
	
	
	
	@After
	public void closeBrowse() {
		
		closeBrowser();

	}

}
