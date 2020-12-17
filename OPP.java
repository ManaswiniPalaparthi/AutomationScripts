package com.specreader.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OPP {
WebDriver driver;
	
	@BeforeClass
	public void before() {
		System.setProperty("webdriver.chrome.driver", "D:\\Infy Artifacts\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://specsqaap.pg.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void Attribute() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Anywheretwo.im");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("Sa061920");
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("searchBox")).sendKeys("OPP");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"exact\"]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
		Thread.sleep(10000);
		if(driver.findElement(By.linkText("90500151")).isDisplayed()) {
			driver.findElement(By.linkText("90500151")).click();
			
		}
		else {
		driver.findElement(By
				.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[1]/a/span"))
				.click();
		}
		Thread.sleep(1000);
		try {
			if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[1]/div[1]/div")).isDisplayed())
			{
		
		List<String> attribute = new ArrayList<String>();
		attribute.add("Title");
		attribute.add("Type");
		attribute.add("Description");
		attribute.add("Originator");
		attribute.add("Last Update User");
		attribute.add("Has Art");
		attribute.add("Revision");
		attribute.add("Originated");
		attribute.add("Phase");
		attribute.add("Owner");
		attribute.add("Segment");
		attribute.add("Has Multiple GTINs on Artwork");
		attribute.add("Structured Release Criteria Required");
		attribute.add("Release Date");
		attribute.add("Effective Date");
		attribute.add("Expiration Date");
		attribute.add("Previous Revision Obsolete Date");
		attribute.add("Other Names");
		attribute.add("Manufacturing Status");
		attribute.add("Reason for Change");
		attribute.add("Brand");
		attribute.add("Class");
		attribute.add("Sub Class");
		attribute.add("Reported Function");
		attribute.add("Base Unit Of Measure");
		attribute.add("Local Description");
		attribute.add("Packaging Technology");
		attribute.add("Part Color");
		attribute.add("Packaging Component Type");
		attribute.add("Printing Process");
		attribute.add("Decoration Details");
		attribute.add("Comments");
		attribute.add("Obsolete Date");
		attribute.add("Obsolete Comment");
		attribute.add("Classification");
		
		
		
		System.out.println("*************************Attribute**************************");
		System.out.println("");
		Thread.sleep(2000);
		WebElement att = driver.findElement(By.xpath("//*[@id=\"Zero\"]"));
		Thread.sleep(1000);
		List<WebElement> l = att.findElements(By.id("pageheaders"));
		for (String s : attribute) {
			int count = 0;
			for (WebElement w : l) {
				String s1 = w.getText();
				if (s.equalsIgnoreCase(s1)) {
					System.out.println(s + " is present on webpage");
					break;

				}

				else {
					count += 1;
					if (count >= l.size()) {
						System.out.println(s + " is not found in webpage");
					}

					continue;
				}

			}
		}
	}
}
			catch(Exception e) {
				System.out.println("Attribute web element not found in webpage");
				System.out.println();
			}
		
		}
	@Test
	public void Related_Specifications() throws Exception{
		try {
			if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[2]/div[1]/div")).isDisplayed())
			{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Related_Specifications **************************");
		System.out.println("");
		Thread.sleep(2000);
		List<String> rs = new ArrayList<String>();
		rs.add("Name");
		rs.add("Title");
		rs.add("Type");
		rs.add("State");
		rs.add("Artwork Primary");
		rs.add("Source");
		rs.add("Revision");
		rs.add("Description");
		rs.add("Specification SubType");
		rs.add("Originator");
		
		List<String> L1 = new ArrayList<String>();
		Thread.sleep(2000);
		WebElement relatedspec = driver.findElement(By.xpath("//*[@id=\"Two\"]"));
		Thread.sleep(1000);
		List<WebElement> rows = relatedspec.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(0).findElements(By.tagName("th"));
		for(WebElement w:cols) {
			String t=w.getText();
			L1.add(t);
		}
		for (String s : rs) {
			int count = 0;
			for (String s1 : L1) {
				if (s.equalsIgnoreCase(s1)) {
					System.out.println(s + " is present on webpage");
					break;

				} else {
					count += 1;
					if (count >= cols.size()) {
						System.out.println(s+" is not in webpage");
					}

					continue;
				}
			}
		}
			}
		}
					catch(Exception e) {
						System.out.println("Related_Specifications web element not found in webpage");
						System.out.println();
					}
	}

	@Test
	public void Plants() throws Exception {
		try {
			if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[3]/div[1]/div")).isDisplayed())
			{
	}
		Thread.sleep(1000);
		List<String> PlantsList = new ArrayList<String>();
		PlantsList.add("Plants");
		PlantsList.add("Authorized");
		
		List<String> L1 = new ArrayList<String>();
		System.out.println("");
		System.out.println("************************* Plants **************************");
		System.out.println("");
		Thread.sleep(2000);
		WebElement plants = driver.findElement(By.xpath("//*[@id=\"Six\"]"));
		Thread.sleep(1000);
		List<WebElement> rows = plants.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(1).findElements(By.tagName("th"));
		for(WebElement w:cols) {
			String t=w.getText();
			L1.add(t);
		}
		for (String s : PlantsList) {
			int count = 0;
			for (String s1 : L1) {
				if (s.equalsIgnoreCase(s1)) {
					System.out.println(s + " is present on webpage");
					break;

				} else {
					count += 1;
					if (count >= cols.size()) {
						System.out.println(s+" is not in webpage");
					}

					continue;
				}
			}
		}
	}
				catch(Exception e) {
					System.out.println("Plants web element not found in webpage");
					System.out.println();
				}
	}

	@Test
	public void Ownership() throws Exception {
		
		try {
			if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[4]/div[1]/div")).isDisplayed())
			{
		Thread.sleep(2000);
		List<String> Owner = new ArrayList<String>();
		Owner.add("Originator");
		Owner.add("Segment");
		Owner.add("Co-Owners");
		Owner.add("Approvers");
		Owner.add("Last Update User");
		Owner.add("Last Update Date");

		System.out.println("");
		System.out.println("************************* Ownership **************************");
		System.out.println("");
		Thread.sleep(2000);
		List<String> L1=new ArrayList<String>();
		List<String> L2=new ArrayList<String>();
		WebElement ownership = driver.findElement(By.xpath("//*[@id=\"Ten\"]"));
		List<WebElement> L3 = ownership.findElements(By.id("pageheaders")); 
		for(WebElement col:L3) {
			String s1=col.getText();
			L1.add(s1);
	}
		for(String s2:L1) {
			for(String s1:s2.split(":")) {
				L2.add(s1);
			}
		}
		for (String s : Owner) {
			int count = 0;
			for (String s1 : L2) {
				if (s.equalsIgnoreCase(s1)) {
					System.out.println(s + " is present on webpage");
					break;

				}

				else {
					count += 1;
					if (count >= L2.size()) {
						System.out.println(s + " is not found in webpage");
					}

					continue;
				}

			}
		}
			}
		}
					catch(Exception e) {
						System.out.println("Ownership web element not found in webpage");
						System.out.println();
					}
	}

	@Test
	public void IP_Classes() throws Exception {

		try {
			if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[5]/div[1]/div")).isDisplayed())
			{
		Thread.sleep(2000);
		List<String> ip = new ArrayList<String>();
		ip.add("Name");
		ip.add("Has Class Access?");
		ip.add("Type");
		ip.add("Description");
		ip.add("State");

		System.out.println("");
		System.out.println("*************************IP_Classes**************************");
		System.out.println("");
		List<String> L1 = new ArrayList<String>();
		Thread.sleep(2000);
		WebElement ipclasses = driver.findElement(By.xpath("//*[@id=\"Eleven\"]"));
		Thread.sleep(1000);
		List<WebElement> rows = ipclasses.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(1).findElements(By.tagName("th"));
		for(WebElement w:cols) {
			String t=w.getText();
			L1.add(t);
		}
		for (String s : ip) {
			int count = 0;
			for (String s1 : L1) {
				if (s.equalsIgnoreCase(s1)) {
					System.out.println(s + " is present on webpage");
					break;

				} else {
					count += 1;
					if (count >= cols.size()) {
						System.out.println(s+" is not in webpage");
					}

					continue;
				}
			}
		}
			}
		}
					catch(Exception e) {
						System.out.println("IP_Classes web element not found in webpage");
						System.out.println();
					}
	}

	@Test
	public void Organizations() throws Exception {
		
		try {
			if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[7]/div[1]/div")).isDisplayed())
			{
		List<String> Org = new ArrayList<String>();
		Org.add("Primary Organization");
		Org.add("Secondary Organization");

		System.out.println("");
		System.out.println("*************************Organizations**************************");
		System.out.println("");
		List<String> L1 = new ArrayList<String>();
		List<String> L2 = new ArrayList<String>();

		WebElement Organizations = driver.findElement(By.xpath("//*[@id=\"Thirteen\"]"));
		List<WebElement> L3 = Organizations.findElements(By.id("pageheaders"));
		for (WebElement col : L3) {
			String s1 = col.getText();
			L1.add(s1);
		}
		for (String s2 : L1) {
			for (String s1 : s2.split(":")) {
				L2.add(s1);
			}
		}
		for (String s : Org) {
			int count = 0;
			for (String s1 : L2) {
				if (s.equalsIgnoreCase(s1)) {
					System.out.println(s + " is present on webpage");
					break;

				}

				else {
					count += 1;
					if (count >= L2.size()) {
						System.out.println(s + " is not found in webpage");
					}

					continue;
				}

			}
		}
			}
		}
					catch(Exception e) {
						System.out.println("Organizations web element not found in webpage");
						System.out.println();
					}

	}
	@Test
	public void Lifecycle_Approval_Powerview() throws Exception{
		try {
			if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[4]/div[1]/div")).isDisplayed())
			{
		Thread.sleep(2000);
		List<String> LAP = new ArrayList<String>();
		LAP.add("Tasks/Signatures");
		LAP.add("Name");
		LAP.add("Approver");
		LAP.add("Title");
		LAP.add("Approval Status");
		LAP.add("Approval/Due Date");
		LAP.add("Comments/Instructions");

		System.out.println("");
		System.out.println("*************************Lifecycle_Approval_Powerview**************************");
		System.out.println("");
		List<String> L1 = new ArrayList<String>();
		Thread.sleep(2000);
		WebElement lifecycle = driver.findElement(By.xpath("//*[@id=\"Nine\"]"));
		Thread.sleep(1000);
		List<WebElement> rows = lifecycle.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(1).findElements(By.tagName("th"));
		for (WebElement w : cols) {
			String t = w.getText();
			L1.add(t);
		}
		for (String s : LAP) {
			int count = 0;
			for (String s1 : L1) {
				if (s.equalsIgnoreCase(s1)) {
					System.out.println(s + " is present on webpage");
					break;

				} else {
					count += 1;
					if (count >= cols.size()) {
						System.out.println(s + " is not in webpage");
					}

					continue;
				}
			}
		}
			}
		}
					catch(Exception e) {
						System.out.println("Lifecycle_Approval_Powerview web element not found in webpage");
						System.out.println();
					}
	}
	
	@Test
	public void Substances_Materials() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Substances & Materials **************************");
		System.out.println("");
			if(driver.getPageSource().contains("Substances & Materials")) {
				System.out.println("Substances & Materials is Present in the WebPage.");
			}
			else {
			System.out.println("Substances & Materials is not Present in the WebPage.");
		}
	}
	
	@Test
	public void Materials_Composition() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Materials_Composition **************************");
		System.out.println("");
			if(driver.getPageSource().contains("Materials & Composition")) {
				System.out.println("Materials Composition is Present in the WebPage.");
			}
			else {
			System.out.println("Materials Composition is not Present in the WebPage.");
		}
	}
	
	
	
	@Test
	public void Master_Specifications() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Master_Specifications **************************");
		System.out.println("");
		if(driver.getPageSource().contains("Master Specifications")) {
			System.out.println("Master Specifications is Present in the WebPage.");
		}
		else {
		System.out.println("Master Specifications is not Present in the WebPage.");
	}
	}
	
	@Test
	public void Reference_Documents() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Reference_Documents **************************");
		System.out.println("");
		if(driver.getPageSource().contains("Reference Documents")) {
			System.out.println("Reference Documents is Present in the WebPage.");
		}
		else {
		System.out.println("Reference Documents is not Present in the WebPage.");
	}
	}
	
	@Test
	public void Performance_Charcteristic() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Performance_Charcteristic **************************");
		System.out.println("");
		if(driver.getPageSource().contains("Performance Charcteristic")) {
			System.out.println("Performance Charcteristic is Present in the WebPage.");
		}
		else {
		System.out.println("Performance Charcteristic is not Present in the WebPage.");
	}
	}
	
	@Test
	public void PQR_View_Manufacturer_Equivalents() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ PQR_View_Manufacturer_Equivalents **************************");
		System.out.println("");
		if(driver.getPageSource().contains("PQR View-Manufacturer Equivalents")) {
			System.out.println("PQR View-Supplier Equivalents is Present in the WebPage.");
		}
		else {
		System.out.println("PQR View-Supplier Equivalents is not Present in the WebPage.");
	}
	}
	
	@Test
	public void PQR_View_Supplier_Equivalents() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ PQR_View_Supplier_Equivalents **************************");
		System.out.println("");
		if(driver.getPageSource().contains("PQR View-Supplier Equivalents")) {
			System.out.println("PQR View-Supplier Equivalents is Present in the WebPage.");
		}
		else {
		System.out.println("PQR View-Supplier Equivalents is not Present in the WebPage.");
	}
	}
	
	
	
	@Test
	public void Security_Classes() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Security_Classes **************************");
		System.out.println("");
		if(driver.getPageSource().contains("Security Classes")) {
			System.out.println("Security Classes is Present in the WebPage.");
		}
		else {
		System.out.println("Security Classes is not Present in the WebPage.");
	}
	}
	
	
	@Test
	public void Files() throws Exception{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("");
		System.out.println("************************ Files **************************");
		System.out.println("");
		if(driver.getPageSource().contains("Files")) {
			System.out.println("Files is Present in the WebPage.");
		}
		else {
		System.out.println("Files is not Present in the WebPage.");
	}
	}
	
	
	@AfterClass
	public void After() {
		driver.close();
		System.out.println("******************Successfully Completed********************");
	}
}
