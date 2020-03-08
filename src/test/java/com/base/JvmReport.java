package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonfile) {
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\UltimateReport");
		Configuration con=new Configuration(loc, "Sk8_Project");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Spirint", "10");
        con.addClassifications("OS", "window 10");
        con.addClassifications("Tester", "Shabeer");
        
        List<String> j=new ArrayList<String>();
        j.add(jsonfile);
        ReportBuilder builder=new ReportBuilder(j, con);
        builder.generateReports();
	}

}
