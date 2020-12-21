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

public class IRMS {
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
	attribute.add("Produced by Formula");
	attribute.add("Specification Sub Type");
	attribute.add("Revision");
	attribute.add("Originated");
	attribute.add("Business Area");
	attribute.add("Product Category Platform");
	attribute.add("Franchise");
	attribute.add("Segment");
	attribute.add("Structured Release Criteria Required");
	attribute.add("Phase");
	attribute.add("Owner");
	attribute.add("Release Date");
	attribute.add("Effective Date");
	attribute.add("Expiration Date");
	attribute.add("Previous Revision Obsolete Date");
	attribute.add("Material Certifications");
	attribute.add("Manufacturing Status");
	attribute.add("Reason for Change");
	attribute.add("Has Art");
	attribute.add("Class");
	attribute.add("Sub Class");
	attribute.add("Reported Function");
	attribute.add("Base Unit Of Measure");
	attribute.add("Local Description");
	attribute.add("Other Names");
	attribute.add("Shipping Information");
	attribute.add("Shelf Life");
	attribute.add("Shipping Hazard Classification");
	attribute.add("Storage Conditions");
	attribute.add("Storage Temperature Limits(%)");
	attribute.add("Storage Humidity Limits");
	attribute.add("Comments");
	attribute.add("Obsolete Date");
	attribute.add("Obsolete Comment");
	
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

//Profile/Identification
@Test
public void ProfileIdentification() {
	  
  	List<String>attribute=new ArrayList<String>();
	attribute.add("INCI Name:");
	attribute.add("Chemical Name:");
	attribute.add("Empirical Formula:");
	attribute.add("Color Index:");
	attribute.add("CISPro #:");
	attribute.add("Experimental Number:");
	attribute.add("Preferred Material:");
	attribute.add("Material Usage Guidance:");
	attribute.add("Material Restriction:");
	attribute.add("Material Restriction Comment:");
	
	WebElement t= d.findElement(By.id("One"));
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


//Physical Properties
@Test
public void PhysicalProperties() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Appearance:");
	attribute.add("Color:");
	attribute.add("Specific Gravity:");
	attribute.add("Melting Point - °C:");
	attribute.add("Boiling Point - °C:");
	attribute.add("Viscosity - centipoise:");
	attribute.add("Form:");
	attribute.add("Vapor Pressure - Pascal:");
	attribute.add("Grade:");
	attribute.add("Aqueous Solubility - %:");
	attribute.add("Autoignition Temp - °C:");
	attribute.add("Flash Point - °C:");
	
	WebElement t= d.findElement(By.id("Two"));
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

//Perfume Properties
@Test
public void PerfumeProperties() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Perfume Properties"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Perfume Properties is present in template but missing in webpage");
		System.out.println();
		}
} 
//Chemical/Molecular Properties
@Test
public void ChemicalMolecularProperties() {
	
		  
	    List<String>attribute=new ArrayList<String>();
		attribute.add("HLB Value:");
		attribute.add("Saponification Value:");
		attribute.add("Hydrophilic Index (HI):");
		attribute.add("Hydroxl Value:");
		attribute.add("pH:");
		attribute.add("Reactivity:");
		attribute.add("IU's per gram:");
		attribute.add("Alkanity(%):");
		attribute.add("Animal Derived:");
		
		WebElement t= d.findElement(By.id("Four"));
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


//Detergent Surfuctant Properties
@Test
public void DetergentSurfuctantProperties() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("CatSO3 Contributor:");
	
	WebElement t= d.findElement(By.id("Five"));
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


//Weight Characteristic
@Test
public void WeightCharacteristic() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Type");
	attribute.add("Gross Weight");
	attribute.add("Weight UoM");
	attribute.add("Comments");
	
	
	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Six"));
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

//Chemical Classification
@Test
public void ChemicalClassification() {
	
		  
	    List<String>attribute=new ArrayList<String>();
		attribute.add("CAS#:");
		attribute.add("EINECS Number:");
		attribute.add("Function:");
		attribute.add("Chemical Group:");
		attribute.add("Ingredient Class:");
		attribute.add("Flavor Cluster Rank:");
		
		
		WebElement t= d.findElement(By.id("Seven"));
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
//Stability Document
@Test
public void StabilityDocument() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Stability Document"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Stability Document is present in template but missing in webpage");
		System.out.println();
		}
} 
//Materials & Composition
@Test
public void MaterialsandComposition() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name(N) Type(T)");
	attribute.add("Title");
	attribute.add("Min Quantity(Min) Dry % (w/w)(Dry) Max Quantity(Max) UofM(UoM)");
	attribute.add("QS/Target(QS), Usage Flags(UF)");
	attribute.add("Applications/Functions");
	attribute.add("Is Impurity");
	attribute.add("CAS Number(CAS) State Revision(SR)");
	attribute.add("Description");
	
	
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

//Substances & Materials
@Test
public void SubstancesandMaterials() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Substances & Materials"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Substances & Materials is present in template but missing in webpage");
		System.out.println();
		}
} 
//Alternates
@Test
public void Alternates() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Alternates"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Alternates is present in template but missing in webpage");
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
//Master Specifications
@Test
public void MasterSpecifications() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Title");
	attribute.add("Type");
	attribute.add("Master Part Name");
	attribute.add("Specification SubType");
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

//Reference Documents
@Test
public void ReferenceDocuments() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Language");
	attribute.add("Source");
	attribute.add("Title");
	attribute.add("Rev");
	attribute.add("Type");
	attribute.add("Description");
	attribute.add("State");


	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Fourteen"));
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


//Performance Characteristic
@Test
public void PerformanceCharacteristic() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Chg");
	attribute.add("Characteristic(Ch) Characteristic Specifics(CS) Path(P)");
	attribute.add("Test Method(Name) Test Method Logic(TML) Test method origin (TMO) Other Test Method Number(TM#) Test Method Specifics(Sp) Test method Reference Document Name(TMRDN)");
	attribute.add("Sampling(SM) Subgroup(SG)");
	attribute.add("Plant Testing Level(LVL) Plant Testing:Retesting(RT) Retesting: Unit of Measure (UoM)");
	attribute.add("Lower Specification Limit(LSL) Lower Target (LTGT) Target (TGT) Upper Target (UTGT) Upper Specification Limit(USL)");
	attribute.add("Unit of Measure(UoM) Report to Nearest(RTN) Report Type(RT)");
	attribute.add("Release Criteria(RC)");
	attribute.add("Action Required(AC) Criticality Factor(CF) Basis (BA)");
	attribute.add("Test Group(TG) Application(AP) Master Part Title(MPT)");
	
	

	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Fifteen"));
	List<WebElement>rows=t.findElements(By.tagName("tr"));
	List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));
	for(WebElement col :cols) {
		String ss =col.getText();
		plist.add(ss);
		//System.out.println(ss);
	}
	List<String>plist1=new ArrayList<String>();
	WebElement t1= d.findElement(By.id("Fifteen"));
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

//Plants IF HALB
@Test
public void PlantsIFHALB() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Plants"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Plants is present in template but missing in webpage");
		System.out.println();
		}
} 
//Plants
@Test
public void Plants() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Plants");
	attribute.add("Authorized");
	attribute.add("Activated");
	
    
	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Seventeen"));
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

//PQRView - Manufacturer Equivalents
@Test
public void PQRViewManufacturerEquivalents() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Revision");
	attribute.add("Type");
	attribute.add("Description");
	attribute.add("Manufacturer");
	attribute.add("State");
	attribute.add("PQR Qualification Name (N) PQR State(S) PQR Revision(R)");
	attribute.add("PQR Qualification Description");
	attribute.add("PQR Location Status");
	attribute.add("PQR Business Area (BA) PQR Product Category Platform (PCP)");
	attribute.add("PQR Plants");
	attribute.add("Comments");

	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("Eighteen"));
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

//PQRView - Supplier Equivalents
@Test
public void PQRViewSupplierEquivalents() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("PQRView - Supplier Equivalents"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("PQRView - Supplier Equivalents is present in template but missing in webpage");
		System.out.println();
		}
} 

//Lifecycle/Approval Powerview
@Test
public void LifecycleApprovalPowerview() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	List<String>attribute=new ArrayList<String>();
	attribute.add("Tasks/Signatures");
	attribute.add("Name");
	attribute.add("Approver");
	attribute.add("Title");
	attribute.add("Approval Status");
	attribute.add("Approval/Due Date");
	attribute.add("Comments/Instructions");
	
	
	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.xpath("//*[@id=\"TwentyOne\"]"));
	List<WebElement>rows=t.findElements(By.tagName("tr"));
	int rsize=rows.size();
	for(int i=0;i<rsize;i++) {
	List<WebElement>cols=rows.get(1).findElements(By.tagName("th"));
	
	for(WebElement col :cols) {
		String ss =col.getText();
		plist.add(ss);
		//System.out.println(ss);
	}
	
	}


	for(String s:attribute) {
		int count=0;
		for(String w:plist) {
		//String s1=w.getText();
			if(s.equalsIgnoreCase(w)) {
				System.out.println(s+" is present on webpage");
				//softassert.assertEquals(w, s);
				break;
			
		
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
	//softassert.assertAll();
	

}

//Ownership
@Test
public void Ownership() {
	  
	  	List<String>attribute=new ArrayList<String>();
	  	attribute.add("Originator:");
		attribute.add("Segment:");
		attribute.add("Co-Owners:");
		attribute.add("Approvers:");
		attribute.add("Last Update User:");
		attribute.add("Last Update Date:");
		



		WebElement t= d.findElement(By.id("TwentyTwo"));
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
	WebElement t= d.findElement(By.id("TwentyThree"));
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

//Regulatory & Safety Data
@Test
public void RegulatoryandSafetyData() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Regulatory & Safety Data"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Regulatory & Safety Data is present in template but missing in webpage");
		System.out.println();
		}
}

//Producing Formula
@Test
public void ProducingFormula() {
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.getPageSource().contains("Producing Formula"))
		System.out.println();
	else {
		System.out.println();
		System.out.println("Producing Formula is present in template but missing in webpage");
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

//R&D Sites
@Test
public void RandDSites() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Name");
	attribute.add("Short Code");
	attribute.add("Description");
	attribute.add("State");


	List<String>plist=new ArrayList<String>();
	WebElement t= d.findElement(By.id("TwentySeven"));
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

//Organizations
@Test
public void Organizations() {
	  
	List<String>attribute=new ArrayList<String>();
	attribute.add("Primary Organization:");
	attribute.add("Secondary Organization:");
	

	WebElement t= d.findElement(By.id("TwentyEight"));
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


		d.findElement(By.id("searchBox")).sendKeys("90983371");
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
			Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr/td[1]/a/span")).click();
}
	

@AfterClass
public void afterClass() {
	
}



	}
	


