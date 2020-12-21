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

public class TUP {
	WebDriver d;
	SoftAssert softassert=new SoftAssert();
	
	
//Attributes
@Test
public void Attributes() {
	  
	  	List<String>attribute=new ArrayList<String>();
		attribute.add("Title");
		attribute.add("Description");
		attribute.add("Type");
		attribute.add("Originator");
		attribute.add("Last Update User");
		attribute.add("Pallet Type");
		attribute.add("Stacking Pattern Name");
		attribute.add("Revision");
		attribute.add("Originated");
		attribute.add("Phase");
		attribute.add("Owner");
		attribute.add("Segment");
		attribute.add("Part Family");
		attribute.add("Release Date");
		attribute.add("Effective Date");
		attribute.add("Expiration Date");
		attribute.add("Previous Revision Obsolete Date");
		attribute.add("Reason for Change");
		attribute.add("Dimension Unit Of Measure");
		attribute.add("Local Description");
		attribute.add("Other Names");
		attribute.add("Packaging Size");
		attribute.add("Packaging Size UoM");
		attribute.add("Comments");
		attribute.add("Outer Dimension Width");
		attribute.add("Outer Dimension Depth");
		attribute.add("Outer Dimension Height");
		attribute.add("OverHang Actual Width");
		attribute.add("OverHang Actual Length");
		attribute.add("UnderHang Actual Width");
		attribute.add("UnderHang Actual Length");
		attribute.add("Warehouse Case Max Height");
		attribute.add("Warehouse Pallet Stack Max Height");
		attribute.add("Truck Pallet Stack Max Height");
		attribute.add("Cube Efficiency");
		attribute.add("Crush Index");
		attribute.add("Customer Units Per Layer");
		attribute.add("Layers Per Transport Unit");
		attribute.add("Area Efficiency");
		attribute.add("Warehouse Logistics");
		attribute.add("Obsolete Date");
		attribute.add("Obsolete Comment");
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
			attribute.add("Substitute Parts (SP) Alternate(Alt)");
			attribute.add("Qty");
			attribute.add("Base Unit of Measure");
			attribute.add("EBOM Comments");
			attribute.add("Release Date");
			attribute.add("Phase (Pha) State(St)");
			attribute.add("Ref Des(RD) On-Shelf Product Density(OSPD)");
			attribute.add("Density Unit Of Measure(DUoM) Optional Components(OC)");
		



			List<String>plist=new ArrayList<String>();
			WebElement t= d.findElement(By.id("Two"));
			List<WebElement>rows=t.findElements(By.tagName("tr"));
			List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
			for(WebElement col :cols) {
				String ss =col.getText();
				plist.add(ss);
				//System.out.println(ss);
			}
			List<String>plist1=new ArrayList<String>();
			WebElement t1= d.findElement(By.id("Two"));
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
//Substitutes 
@Test
public void Substitutes() {
	  
	  List<String>attribute=new ArrayList<String>();
			attribute.add("Substitute Parts(SP) REV");
			attribute.add("Chg");
			attribute.add("Substitution Combination Number(SCN) Title");
			attribute.add("Type(T) Specification SubType(SST)");
			attribute.add("QTY");
			attribute.add("Base Unit of Measure");
			attribute.add("Valid Start Date");
			attribute.add("Valid Until Date");
			attribute.add("Ref Des");
			attribute.add("Comments");
			attribute.add("Substitute For(SF) Rev(R)");
			attribute.add("Type(T) Title(Ti)");
			attribute.add("Specification Sub Type(SST) Optional Components(OC)");
			


			List<String>plist=new ArrayList<String>();
			WebElement t= d.findElement(By.id("Three"));
			List<WebElement>rows=t.findElements(By.tagName("tr"));
			List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
			for(WebElement col :cols) {
				String ss =col.getText();
				plist.add(ss);
				//System.out.println(ss);
			}
			List<String>plist1=new ArrayList<String>();
			WebElement t1= d.findElement(By.id("Three"));
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
//Bill Of Materials - Master Customer Unit
@Test
public void BillofMaterialsMasterCustomerUnit() {
	  
	  List<String>attribute=new ArrayList<String>();
	    attribute.add("Name(N) Rev(R)");
		attribute.add("Chg");
		attribute.add("F/N");
		attribute.add("Title");
		attribute.add("Type");
		attribute.add("Substitute Parts (SP) Alternate(Alt)");
		attribute.add("Qty");
		attribute.add("Base Unit of Measure");
		attribute.add("EBOM Comments");
		attribute.add("Release Date");
		attribute.add("Phase (Pha) State(St)");
		attribute.add("Ref Des(RD) On-Shelf Product Density(OSPD)");
		attribute.add("Density Unit Of Measure(DUoM) Optional Components(OC)");
		



		List<String>plist=new ArrayList<String>();
		WebElement t= d.findElement(By.id("Four"));
		List<WebElement>rows=t.findElements(By.tagName("tr"));
		List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
		for(WebElement col :cols) {
			String ss =col.getText();
			plist.add(ss);
			//System.out.println(ss);
		}
		List<String>plist1=new ArrayList<String>();
		WebElement t1= d.findElement(By.id("Four"));
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

//Bill of Materials-Master Inner Pack
@Test
public void BillofMaterialsMasterInnerPack() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Bill of Materials-Master Inner Pack"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Bill of Materials-Master Inner Pack is present in template but missing in webpage");
		System.out.println();
		}
}

//Substitutes Master Inner Pack
@Test
public void SubstitutesMasterInnerPack() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Substitutes Master Inner Pack"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Substitutes Master Inner Pack is present in template but missing in webpage");
		System.out.println();
		}
}

//Bill of Materials-Master Consumer Unit
@Test
public void BillofMaterialsMasterConsumerUnit() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Bill of Materials-Master Consumer Unit"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Bill of Materials-Master Consumer Unit is present in template but missing in webpage");
		System.out.println();
		}
}

//Substitutes Master Consumer Unit
@Test
public void SubstitutesMasterConsumerUnit() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Substitutes Master Consumer Unit"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Substitutes Master Consumer Unit is present in template but missing in webpage");
		System.out.println();
		}
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
	attribute.add("Originator");
	
	

	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Nine"));
	List<WebElement>rows=t.findElements(By.tagName("tr"));
	List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
	for(WebElement col :cols) {
		String ss =col.getText();
		plist.add(ss);
		//System.out.println(ss);
	}
	List<String>plist1=new ArrayList<String>();
	WebElement t1= d.findElement(By.id("Nine"));
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

//Lifecycle/Approval Powerview
@Test
public void LifecycleApprovalPowerview() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Approver");
	attribute.add("Title");
	attribute.add("Approval Status");
	attribute.add("Approval/Due Date");
	attribute.add("Comments/Instructions");
	

	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Eleven"));
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
	WebElement t= d.findElement(By.id("Thirteen"));
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

//Related ATS
@Test
public void RelatedATS() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Related ATS"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Related ATS is present in template but missing in webpage");
		System.out.println();
		}
}

//Organizations
@Test
public void Organizations() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Primary Organization:");
	attribute.add("Secondary Organization:");
	

	WebElement t= d.findElement(By.id("Sixteen"));
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


		d.findElement(By.id("searchBox")).sendKeys("TUP");
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[5]/td[1]/a/span")).click();
}


@AfterClass
public void afterClass() {
}



}
