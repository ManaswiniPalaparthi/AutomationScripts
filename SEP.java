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

public class SEP {
	WebDriver d;
	SoftAssert softassert=new SoftAssert();

//Attributes
@Test
public void Attributes() {
	  
	  	List<String>attribute=new ArrayList<String>();
		attribute.add("Title");
		attribute.add("Type");
		attribute.add("Originator");
		attribute.add("Description");
		attribute.add("Franchise");
		attribute.add("Revision");
		attribute.add("Originated");
		attribute.add("Owner");
		attribute.add("Release Date");
		attribute.add("Effective Date");
		attribute.add("Previous Revision Obsolete Date");
		attribute.add("Expiration Date");
		attribute.add("Reason for Change");
		attribute.add("Vendor");
		attribute.add("Vendor Number");
		attribute.add("Vendor Plant Location(Street Address Number)");
		attribute.add("Vendor Plant Location(Street Address Name)");
		attribute.add("Vendor Plant Location(City/Town)");
		attribute.add("Vendor Plant Location(State/Province)");
		attribute.add("Vendor Plant Location(Market)");
		attribute.add("Last Update User");
		attribute.add("Comments");
		attribute.add("Obsolete Date");
		attribute.add("Obsolete Comment");
		attribute.add("Material Restriction");
		attribute.add("Material Restriction Comment");
		attribute.add("Classification");
		
		



		WebElement t= d.findElement(By.id("Zero"));
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

//Reach
@Test
public void REACH() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("REACH"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("REACH is present in template but missing in webpage");
		System.out.println();
		}
}

//Materials & Composition
@Test
public void MaterialsandComposition() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Materials & Composition"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Materials & Composition is present in template but missing in webpage");
		System.out.println();
		}
}

//Related Specifications
@Test
public void RelatedSpecifications() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Related Specifications"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Related Specifications is present in template but missing in webpage");
		System.out.println();
		}
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

//Lifecycle/Approval Powerview
@Test
public void LifecycleApprovalPowerview() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Lifecycle/Approval Powerview"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Lifecycle/Approval Powerview is present in template but missing in webpage");
		System.out.println();
		}
}

//Ownership
@Test
public void Ownership() {
	  
  	List<String>attribute=new ArrayList<String>();
	attribute.add("Originator");
	attribute.add("Segment");
	attribute.add("Co-Owners");
	attribute.add("Approvers");
	attribute.add("Last Update User");
	attribute.add("Last Update Date");
	

	WebElement t= d.findElement(By.id("Six"));
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

//IP classes
@Test
public void IPclasses() {
	  
  	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Has Class Access?");
	attribute.add("Type");
	attribute.add("Description");
	attribute.add("State");
	
	
	
	
	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Seven"));
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

//Enterprise Parts
@Test
public void EnterpriseParts() {
	  
  	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Revision");
	attribute.add("Type");
	attribute.add("Description");
	attribute.add("State");
	attribute.add("PQRs");
	attribute.add("Name");
	attribute.add("State");
	attribute.add("Revision");
	


	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Nine"));
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

//Equivalent MEP
@Test
public void EquivalentMEP() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Equivalent MEP"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Equivalent MEP is present in template but missing in webpage");
		System.out.println();
		}
}

//Certifications
@Test
public void Certifications() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Certifications"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Certifications is present in template but missing in webpage");
		System.out.println();
		}
}

//Organizations
@Test
public void Organizations() {
	  
  	List<String>attribute=new ArrayList<String>();
	attribute.add("Primary Organization");
	attribute.add("Secondary Organization");
	

	WebElement t= d.findElement(By.id("Twelve"));
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


		d.findElement(By.id("searchBox")).sendKeys("SEP");
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[20]/td[1]/a/span")).click();
}


@AfterClass
public void afterClass() {
}


}



