package in.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateJvmReports {
	
	public static void generateReport(String jsonpath) {
		
		
		File f = new File(System.getProperty("user.dir")+"//target");
		
		Configuration c = new Configuration(f, "Amazon and snapdeal");
		
		c.addClassifications("os", "windows10");
		c.addClassifications("tool", "eclipse");
		c.addClassifications("report", "cucumber report");
		c.addClassifications("testing framework", "Cucumber");
		
		
		List<String> li = new ArrayList<String>();
		
		li.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(li, c);
		
		r.generateReports();
		
		System.out.println("Report generated");
		
		
		
		
		
		
	}
	
	
	

}
