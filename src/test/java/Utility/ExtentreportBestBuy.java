package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportBestBuy {

	public static ExtentReports getReport() {
		
		String path="C:\\Users\\Jenner\\eclipse-workspace\\E-Commerce_Bestbuy\\report\\Best-buy.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Best Buy Report");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		return extent;
	}
}