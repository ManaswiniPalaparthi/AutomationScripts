package accelerateproject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MCUP {
	WebDriver d;
	SoftAssert softassert=new SoftAssert();

	
//Attributes
@Test
public void Attributes() {
	  
	  	List<String>attribute=new ArrayList<String>();
		attribute.add("Title");
		attribute.add("Type");
		attribute.add("Description");
		attribute.add("Originator");
		attribute.add("Revision");
		attribute.add("Originated");
		attribute.add("Phase");
		attribute.add("Owner");
		attribute.add("Last Update User");
		attribute.add("Segment");
	    attribute.add("Release Date");
		attribute.add("Effective Date");
		attribute.add("Expiration Date");
		attribute.add("Previous Revision Obsolete Date");
		attribute.add("Other Names");
		attribute.add("Manufacturing Status");
		attribute.add("Structured Release Criteria Required");
		attribute.add("Reason for Change");
		attribute.add("Dimension Unit Of Measure");
		attribute.add("Outer Dimension Width");
		attribute.add("Outer Dimension Depth");
		attribute.add("Outer Dimension Height");
		attribute.add("Comments");
		attribute.add("Obsolete Date");
		attribute.add("Obsolete Comment");
		attribute.add("Classification");
		attribute.add("Project Initiative MileStone");
		



		WebElement t= d.findElement(By.id("zero"));
		List<WebElement>l=t.findElements(By.id("pageheaders"));
		for(String s:attribute) {
			int count=0;
			for(WebElement w:l) {
				String s1=w.getText();
				if(s.equalsIgnoreCase(s1)) {
					//org.testng.Assert.assertEquals(s1, s);
					Assert.assertEquals(s1, s);
					System.out.println(s+" is present on webpage");
					break;
				
				}

				else {
					count+=1;
					if(count>=l.size()) {
						System.out.println("Desc not in webpage");
						//org.testng.Assert.assertFalse(true);
						
					}
					
				continue;
				}
			}
			}
}

//Notes
@Test
public void Notes() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Notes"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Notes is present in template but missing in webpage");
		System.out.println();
		}
}

//Bill of Materials
@Test
public void BillofMaterials() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name(N) Rev(R)");
	attribute.add("Chg");
	attribute.add("F/N");
	attribute.add("Title");
	attribute.add("Type");
	attribute.add("Substitute Parts (SP) Alternate (Alt)");
	attribute.add("Qty");
	attribute.add("Base Unit Of Measure");
	attribute.add("EBOM Comments");
	attribute.add("State");
	attribute.add("Phase");
	attribute.add("Ref Des");
	attribute.add("On-shelf Product Density(OSPD) Density Unit of Measure(DUOM)");
	
	
	
	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("two"));
	List<WebElement>rows=t.findElements(By.tagName("tr"));
	List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
	for(WebElement col :cols) {
		String ss =col.getText();
		plist.add(ss);
		//System.out.println(ss);
	}
	List<String>plist1=new ArrayList<String>();
	WebElement t1= d.findElement(By.id("two"));
	List<WebElement>rows1=t1.findElements(By.tagName("tr"));
	List<WebElement>cols1=rows1.get(0).findElements(By.tagName("th"));
	for(WebElement col :cols1) {
		String ss =col.getText();
		plist1.add(ss);
	}
	for(String s:plist1) {
		for(String ss:s.split(":")) {
			plist.add(ss);
		}
	}

	for(String s:attribute) {
		int count=0;
		for(String w:plist) {
		//String s1=w.getText();
			if(s.equalsIgnoreCase(w)) {
				System.out.println(s+" is present on webpage");
				softassert.assertEquals(w, s);
			
		
			}

			else {
				count+=1;
				if(count>=plist.size()) {
					System.out.println(s+"Desc not in webpage");
				}
				continue;
			}
		}
	}
	softassert.assertAll();
	

}

//Related Specifications
@Test
public void RelatedSpecifications() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Title");
	attribute.add("Type");
	attribute.add("State");
	attribute.add("Source");
	attribute.add("Revision");
	attribute.add("Description");
	attribute.add("Specification SubType");
	attribute.add("Inheritance Type");
	attribute.add("Originator");
	
	

	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("three"));
	List<WebElement>rows=t.findElements(By.tagName("tr"));
	List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
	for(WebElement col :cols) {
		String ss =col.getText();
		plist.add(ss);
		//System.out.println(ss);
	}
	List<String>plist1=new ArrayList<String>();
	WebElement t1= d.findElement(By.id("three"));
	List<WebElement>rows1=t1.findElements(By.tagName("tr"));
	List<WebElement>cols1=rows1.get(0).findElements(By.tagName("th"));
	for(WebElement col :cols1) {
		String ss =col.getText();
		plist1.add(ss);
	}
	for(String s:plist1) {
		for(String ss:s.split(":")) {
			plist.add(ss);
		}
	}

	for(String s:attribute) {
		int count=0;
		for(String w:plist) {
		//String s1=w.getText();
			if(s.equalsIgnoreCase(w)) {
				System.out.println(s+" is present on webpage");
				softassert.assertEquals(w, s);
			
		
			}

			else {
				count+=1;
				if(count>=plist.size()) {
					System.out.println(s+"Desc not in webpage");
				}
				continue;
			}
		}
	}
	softassert.assertAll();
	

}

//Reference Documents
@Test
public void ReferenceDocuments() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Reference Documents"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Reference Documents is present in template but missing in webpage");
		System.out.println();
		}
}

//Performance Characteristics
@Test
public void PerformanceCharacteristics() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Performance Characteristics"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Performance Characteristics is present in template but missing in webpage");
		System.out.println();
		}
}

//Lifecycle/Approval Powerview
@Test
public void LifecycleApprovalPowerview() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Tasks/Signatures");
	attribute.add("Name");
	attribute.add("Approver");
	attribute.add("Title");
	attribute.add("Approval Status");
	attribute.add("Approval/Due Date");
	attribute.add("Comments/Instructions");
	

	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("six"));
	List<WebElement>rows=t.findElements(By.tagName("tr"));
	List<WebElement>cols=rows.get(1).findElements(By.tagName("th"));
	for(WebElement col :cols) {
		String ss =col.getText();
		plist.add(ss);
		System.out.println(ss);
	}


	for(String s:attribute) {
		int count=0;
		for(String w:plist) {
		//String s1=w.getText();
			if(s.equalsIgnoreCase(w)) {
				System.out.println(s+" is present on webpage");
				softassert.assertEquals(w, s);
			
		
			}

			else {
				count+=1;
				if(count>=plist.size()) {
					System.out.println(s+"Desc not in webpage");
				}
				continue;
			}
		}
	}
	softassert.assertAll();
	

}

//Ownership
@Test
public void Ownership() {
	  
	  	List<String>attribute=new ArrayList<String>();
	  	attribute.add("Originator:");
		attribute.add("Segment:");
		attribute.add("Co-Owners:");
		attribute.add("Last Update User:");
		attribute.add("Last Update Date:");
		



		WebElement t= d.findElement(By.id("seven"));
		List<WebElement>l=t.findElements(By.id("pageheaders"));
		for(String s:attribute) {
			int count=0;
			for(WebElement w:l) {
				String s1=w.getText();
				if(s.equalsIgnoreCase(s1)) {
					//org.testng.Assert.assertEquals(s1, s);
					Assert.assertEquals(s1, s);
					System.out.println(s+" is present on webpage");
					break;
				
				}

				else {
					count+=1;
					if(count>=l.size()) {
						System.out.println("Desc not in webpage");
						//org.testng.Assert.assertFalse(true);
						
					}
					
				continue;
				}
			}
			}
}

//IP Classes
@Test
public void IPclasses() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Has Class Access?");
	attribute.add("Type");
	attribute.add("Description");
	attribute.add("State");
	

	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("eight"));
	List<WebElement>rows=t.findElements(By.tagName("tr"));
	List<WebElement>cols=rows.get(1).findElements(By.tagName("th"));
	for(WebElement col :cols) {
		String ss =col.getText();
		plist.add(ss);
		System.out.println(ss);
	}


	for(String s:attribute) {
		int count=0;
		for(String w:plist) {
		//String s1=w.getText();
			if(s.equalsIgnoreCase(w)) {
				System.out.println(s+" is present on webpage");
				softassert.assertEquals(w, s);
			
		
			}

			else {
				count+=1;
				if(count>=plist.size()) {
					System.out.println(s+"Desc not in webpage");
				}
				continue;
			}
		}
	}
	softassert.assertAll();
	

}

//Security Classes
@Test
public void SecurityClasses() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Security Classes"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Security Classes is present in template but missing in webpage");
		System.out.println();
		}
}

//Organizations
@Test
public void Organizations() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Primary Organization:");
	attribute.add("Secondary Organization:");
	

	WebElement t= d.findElement(By.id("ten"));
	List<WebElement>l=t.findElements(By.id("pageheaders"));
	for(String s:attribute) {
		int count=0;
		for(WebElement w:l) {
			String s1=w.getText();
			if(s.equalsIgnoreCase(s1)) {
				//org.testng.Assert.assertEquals(s1, s);
				Assert.assertEquals(s1, s);
				System.out.println(s+" is present on webpage");
				break;
			
			}

			else {
				count+=1;
				if(count>=l.size()) {
					System.out.println("Desc not in webpage");
					//org.testng.Assert.assertFalse(true);
					
				}
				
			continue;
			}
		}
		}



}

//Files
@Test
public void Files() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Files"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Files is present in template but missing in webpage");
		System.out.println();
		}
}

@BeforeClass
public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\jar files\\selenium_essentials\\selenium_essentials\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://specsqaap.pg.com/login");
			
		d.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		d.findElement(By.id("username")).sendKeys("Anywheretwo.im");
		d.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		d.findElement(By.id("password")).sendKeys("Sa061920");
		d.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		d.findElement(By.id("loginButton")).click();
		d.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		Thread.sleep(5000);


		d.findElement(By.id("searchBox")).sendKeys("MCUP");
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[4]/td[1]/a/span")).click();
}


@AfterClass
public void afterClass() {
}



}
