package com.specreader.automation;

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

public class DPP {
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
		driver.findElement(By.id("searchBox")).sendKeys("DPP");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"exact\"]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/form/div/div[1]/div/button")).click();
		Thread.sleep(10000);
		if (driver.findElement(By.linkText("91829971")).isDisplayed()) {
			Thread.sleep(10000);
			driver.findElement(By.linkText("91829971")).click();
		} else {
			driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[1]/a/span"))
					.click();
		}
		Thread.sleep(1000);
		try {
			if (driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[1]/div[1]/div"))
					.isDisplayed()) {

				List<String> attribute = new ArrayList<String>();
				attribute.add("Title");
				attribute.add("Description");
				attribute.add("Type");
				attribute.add("Specification Sub Type");
				attribute.add("Replaced Product Name");
				attribute.add("Business Area");
				attribute.add("Product Technology Chassis");
				attribute.add("Product Category Platform");
				attribute.add("Product Technology Platform");
				attribute.add("Franchise");
				attribute.add("Structured Release Criteria Required");
				attribute.add("Reported Function");
				attribute.add("Class");
				attribute.add("Sub Class");
				attribute.add("Dangerous Goods Ready");
				attribute.add("Originator");
				attribute.add("Last Update User");
				attribute.add("Revision");
				attribute.add("Originated");
				attribute.add("Segment");
				attribute.add("Phase");
				attribute.add("Owner");
				attribute.add("Release Date");
				attribute.add("Effective Date");
				attribute.add("Expiration Date");
				attribute.add("Previous Revision Obsolete Date");
				attribute.add("Reason for Change");
				attribute.add("Is Product Certification or Local Standards Compliance Statement Required");
				attribute.add("Product Dose per Use");
				attribute.add("Product Dose per Use UoM");
				attribute.add("Expected Frequency of Use");
				attribute.add("Expected Frequency of Use UoM");
				attribute.add("Mode of Product Disposal");
				attribute.add("Manufacturing Status");
				attribute.add("Brand");
				attribute.add("Product Extra Variant");
				attribute.add("Base Unit Of Measure");
				attribute.add("On-shelf Product Density");
				attribute.add("Density Unit Of Measure");
				attribute.add("Base Quantity");
				attribute.add("SAP BOM Base QTY");
				attribute.add("Local Description");
				attribute.add("Other Names");
				attribute.add("Intended Markets");
				attribute.add("Unique Formula Identifier");
				attribute.add("Does this Device Contain Flammable Liquid (As a Raw Material)?");
				attribute.add("Comments");
				attribute.add("Obsolete Date");
				attribute.add("Obsolete Comment");
				
				System.out.println("************************* Attribute **************************");
				System.out.println("");
				Thread.sleep(2000);
				WebElement att = driver.findElement(By.xpath("//*[@id=\"zero\"]"));
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
								System.out.println(s + " present in template but missing in webpage");
							}

							continue;
						}

					}
				}
			}
		} catch (Exception e) {
			System.out.println("Attribute present in template but missing in webpage");
			System.out.println();
		}

	}
	
	
	 @Test
	  public void Weight_Caracteristics() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
			  if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[2]/div[1]/div")).isDisplayed())
			  {
				  System.out.println();
				  System.out.println("******************* Weight Characteristics ******************");
				  System.out.println();
			      List<String> Wt_Chara = new ArrayList<String>();
			      Wt_Chara.add("Name");
			      Wt_Chara.add("Type");
			      Wt_Chara.add("Gross Weight");
			      Wt_Chara.add("Weight UoM");
			      Wt_Chara.add("Net Weight");
			      Wt_Chara.add("Roll-up Net Weight to COP");
			      Wt_Chara.add("Comments");
			      
			      WebElement table=driver.findElement(By.id("one"));
			      List<WebElement> row = table.findElements(By.tagName("tr"));
			      for (String s1 : Wt_Chara) {
			          for (WebElement r : row) {
			        	  List<WebElement> col = r.findElements(By.tagName("th"));
			        	  for(WebElement c:col) {
			        		  String s2 = c.getText();
			              if (s1.equalsIgnoreCase(s2)) {
			                  Assert.assertEquals(s1, s2);
			                  System.out.println(s1+ " is present on the template as well as on the webpage");
			                  break;
			              }
			              continue;
			              }
			          }
			      }
			  }
		  
			  else {
				  System.out.println();
				  System.out.println("Weight Characteristic is present in template but missing in webpage");
				  System.out.println();
		  }
	  }
	 
	
	 @Test
		public void Storage_Transportation_Labeling_Assessment_Data() throws InterruptedException {
			
			Thread.sleep(1000);
			try {
				if (driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[3]/div[1]/div"))
						.isDisplayed()) {

					List<String> STLAD = new ArrayList<String>();
					STLAD.add("Technology");
					STLAD.add("Power Source");
					STLAD.add("Battery Type");
					STLAD.add("Nominal Battery Weight");
					STLAD.add("Battery weight UOM");
					STLAD.add("Battery chemical composition");
					STLAD.add("Grams of Lithium per cell(required for Lithium metal batteries)");
					STLAD.add("Grams of Lithium UoM");
					STLAD.add("Lithium Battery Energy(required for Lithium ion batteries)");
					STLAD.add("Lithium Battery Energy UOM");
					STLAD.add("Nominal Battery Voltage");
					STLAD.add("Battery Voltage UOM");
					STLAD.add("Battery Size");
					STLAD.add("Is this a Button Battery? (required for Lithium metal batteries)");
					STLAD.add("Number of cells (required for all Lithium batteries)");
					STLAD.add("Typical Capacity");
					STLAD.add("Typical Capacity UOM");
					STLAD.add("Is the product a battery?");
					STLAD.add("Does the product contain a battery?");
					STLAD.add("Number of cells/batteries shipped inside Device");
					STLAD.add("Number of cells/batteries shipped outside Device");
					STLAD.add("Are Batteries Required");
					STLAD.add("Is Product Marketed as Children's Product");
					STLAD.add("Does the Product Require Child Safe Design");
					STLAD.add("Is Product Exposed to Children");
					STLAD.add("Warehousing Classification");
					STLAD.add("Evaporation Rate");
					STLAD.add("Reserve Acidity");
					STLAD.add("Reserve Alkalinity");
					STLAD.add("Shipping Hazard Classification");
					STLAD.add("Shipping Information");
					STLAD.add("Storage Conditions");
					
					
					System.out.println("");
					System.out.println("***************** Storage_Transportation_Labeling_Assessment_Data *********************");
					System.out.println("");
					Thread.sleep(2000);
					WebElement table = driver.findElement(By.xpath("//*[@id=\"four\"]"));
					Thread.sleep(1000);
					List<WebElement> l = table.findElements(By.id("pageheaders"));
					for (String s : STLAD) {
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
									System.out.println(s + " present in template but missing in webpage");
								}

								continue;
							}

						}
					}
				}
			} catch (Exception e) {
				System.out.println("Attribute present in template but missing in webpage");
				System.out.println();
			}

		}
	 
	 @Test
		public void MarketClearance() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("********************** MarketClearance **************************");
			System.out.println("");
			try {
				if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[4]/div[1]/div")).isDisplayed()) 
				{

					List<String> mc=new ArrayList<String>();
					mc.add("Market");
					mc.add("Overall Clearance Status");
					mc.add("GPS Approval Status");
					mc.add("Product Regulatory Classification");
					mc.add("Clearance Number");
					mc.add("Market Product Registration Number");
					mc.add("Registration Status(RS) Registration Expiration Date(RE)");
					mc.add("RegistrationRenewal LeadTime(Days) (Rr)RegistrationRenewal Status(Rw)");
					mc.add("Restrictions");
					mc.add("Registered Product Name");
					mc.add("Packing Site");
					mc.add("Bulk Making / Manufacturing Site (BMS)Comments (C)");
					mc.add("Rs");
					mc.add("Re");
					mc.add("Rr");
					mc.add("Rw");
					mc.add("BMS");
					mc.add("C");

					List<String> marketclearance=new ArrayList<String>();
					WebElement tab=driver.findElement(By.xpath("//*[@id=\"nine\"]/div/div/table/thead/tr[2]"));
					List<WebElement> rows=tab.findElements(By.tagName("tr"));
					List<WebElement> cols=rows.get(0).findElements(By.tagName("th"));
					for(WebElement col:cols)
					{
						String ss=col.getText();
						marketclearance.add(ss);
					}

					List<String> p=new ArrayList<String>();
					WebElement tab1=driver.findElement(By.xpath("//*[@id=\"nine\"]/div/div/table/tbody"));
					List<WebElement> rows1=tab1.findElements(By.tagName("tr"));
					List<WebElement> cols1=rows1.get(0).findElements(By.className("bomFontClass"));
					for(WebElement col:cols1)
					{
						String ss=col.getText();
						p.add(ss);
					}
					for(String s:p) {
						for(String ss:s.split(":")) {
							marketclearance.add(ss);
						}
					}
					for(String s:mc) {
						int count=0;
						for(String s1:marketclearance) {

							if(s.equalsIgnoreCase(s1)) {
								SoftAssert softAssertion= new SoftAssert();
								softAssertion.assertEquals(s,s1);
								System.out.println(s+" is present on webpage");
								break;

							}

							else {
								count+=1;
								if(count>=marketclearance.size()) 
								{
									System.out.println(s+" not in webpage");
									SoftAssert softAssertion= new SoftAssert();
									softAssertion.assertFalse(true);
								}

								continue;
							}
						}
					}
				}
			}
			catch(Exception e) {
				System.out.println("Market Clearance present in template but missing in webpage");
			}
		}
	 
	 @Test
		public void Materials_Composition() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("********************** Materials & Composition **************************");
			System.out.println("");
			try {
				if(driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[5]/div[1]/div")).isDisplayed()) 
				{

					List<String> mc=new ArrayList<String>();
					mc.add("Name(N) Type(T)");
					mc.add("Title");
					mc.add("Min Quantity (Min) Dry % (w/w)(Dry) Max Quantity (Max)");
					mc.add("Quantity UofM(UoM): QS/Target(QS)Usage Flags(UF)");
					mc.add("Applications/Functions");
					mc.add("Is Impurity(IP) CAS Number(CAS) State(State) Revision(Rev)");
					mc.add("Description");
					mc.add("N");
					mc.add("T");
					mc.add("Min");
					mc.add("Dry");
					mc.add("Max");
					mc.add("UoM");
					mc.add("QS");
					mc.add("UF");
					mc.add("IP");
					mc.add("CAS");
					mc.add("State");
					mc.add("Rev");


					List<String> marketcomposition=new ArrayList<String>();
					WebElement tab=driver.findElement(By.xpath("//*[@id=\"ten\"]/div/div/table/thead"));
					List<WebElement> rows=tab.findElements(By.tagName("tr"));
					List<WebElement> cols=rows.get(0).findElements(By.tagName("th"));
					for(WebElement col:cols)
					{
						String ss=col.getText();
						marketcomposition.add(ss);
					}

					List<String> p=new ArrayList<String>();
					WebElement tab1=driver.findElement(By.xpath("//*[@id=\"ten\"]/div/div/table/tbody"));
					List<WebElement> rows1=tab1.findElements(By.tagName("tr"));
					List<WebElement> cols1=rows1.get(0).findElements(By.className("bomFontClass"));
					for(WebElement col:cols1)
					{
						String ss=col.getText();
						p.add(ss);
					}
					for(String s:p) {
						for(String ss:s.split(":")) {
							marketcomposition.add(ss);
						}
					}
					for(String s:mc) {
						int count=0;
						for(String s1:marketcomposition) {

							if(s.equalsIgnoreCase(s1)) {
								SoftAssert softAssertion= new SoftAssert();
								softAssertion.assertEquals(s,s1);
								System.out.println(s+" is present on webpage");
								break;

							}

							else {
								count+=1;
								if(count>=marketcomposition.size()) 
								{
									System.out.println(s+" not in webpage");
									SoftAssert softAssertion= new SoftAssert();
									softAssertion.assertFalse(true);
								}

								continue;
							}
						}
					}
				}
			}
			catch(Exception e) {
				System.out.println("Market & Composition present in template but missing in webpage");
			}
		}

	 
	 @Test
		public void Plants() throws Exception {
			Thread.sleep(1000);
			try {
				if (driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[6]/div[1]/div"))
						.isDisplayed()) {
					List<String> PlantsList = new ArrayList<String>();
					PlantsList.add("Plants");
					PlantsList.add("Authorized To Use");
					PlantsList.add("Authorized to Produce");
					PlantsList.add("Activated");
					
					
					List<String> L1 = new ArrayList<String>();
					System.out.println("");
					System.out.println("************************* Plants **************************");
					System.out.println("");
					Thread.sleep(2000);
					WebElement plants = driver.findElement(By.xpath("//*[@id=\"seventeen\"]"));
					Thread.sleep(1000);
					List<WebElement> rows = plants.findElements(By.tagName("tr"));
					List<WebElement> cols = rows.get(1).findElements(By.tagName("th"));
					for (WebElement w : cols) {
						String t = w.getText();
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
									System.out.println(s + " present in template but missing in webpage");
								}

								continue;
							}
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Plants present in template but missing in webpage");
				System.out.println();
			}
		}
	 @Test
		public void Lifecycle_Approval_Powerview() throws Exception {
			try {
				if (driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[7]/div[1]/div"))
						.isDisplayed()) {
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
					System.out.println("************************* Lifecycle_Approval_Powerview **************************");
					System.out.println("");
					List<String> L1 = new ArrayList<String>();
					Thread.sleep(2000);
					WebElement lifecycle = driver.findElement(By.xpath("//*[@id=\"twentyone\"]"));
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
									System.out.println(s + " present in template but missing in webpage");
								}

								continue;
							}
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Lifecycle_Approval_Powerview present in template but missing in webpage");
				System.out.println();
			}
		}

		@Test
		public void Ownership() throws Exception {

			Thread.sleep(2000);
			try {
				if (driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[8]/div[1]/div"))
						.isDisplayed()) {
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
					List<String> L1 = new ArrayList<String>();
					List<String> L2 = new ArrayList<String>();
					WebElement ownership = driver.findElement(By.xpath("//*[@id=\"twentytwo\"]"));
					List<WebElement> L3 = ownership.findElements(By.id("pageheaders"));
					for (WebElement col : L3) {
						String s1 = col.getText();
						L1.add(s1);
					}
					for (String s2 : L1) {
						for (String s1 : s2.split(":")) {
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
									System.out.println(s + " present in template but missing in webpage");
								}

								continue;
							}

						}
					}
				}
			} catch (Exception e) {
				System.out.println("Ownership present in template but missing in webpage");
				System.out.println();
			}
		}

		@Test
		public void IP_Classes() throws Exception {

			Thread.sleep(2000);
			try {
				if (driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[9]/div[1]/div"))
						.isDisplayed()) {
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
					WebElement ipclasses = driver.findElement(By.xpath("//*[@id=\"twentythree\"]"));
					Thread.sleep(1000);
					List<WebElement> rows = ipclasses.findElements(By.tagName("tr"));
					List<WebElement> cols = rows.get(1).findElements(By.tagName("th"));
					for (WebElement w : cols) {
						String t = w.getText();
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
									System.out.println(s + " present in template but missing in webpage");
								}

								continue;
							}
						}
					}
				}
			} catch (Exception e) {
				System.out.println("IP_Classes present in template but missing in webpage");
				System.out.println();
			}
		}

		@Test
		public void Organizations() throws Exception {

			try {
				if (driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[10]/div[1]/div"))
						.isDisplayed()) {
					List<String> Org = new ArrayList<String>();
					Org.add("Primary Organization");
					Org.add("Secondary Organization");

					System.out.println("");
					System.out.println("*************************Organizations**************************");
					System.out.println("");
					List<String> L1 = new ArrayList<String>();
					List<String> L2 = new ArrayList<String>();

					WebElement Organizations = driver.findElement(By.xpath("//*[@id=\"twentysix\"]"));
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
									System.out.println(s + " present in template but missing in webpage");
								}

								continue;
							}

						}
					}
				}
			} catch (Exception e) {
				System.out.println("Organizations present in template but missing in webpage");
				System.out.println();
			}

		}
		
		@Test
		public void Dangerous_Goods_Classification() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Dangerous_Goods_Classification **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Dangerous Goods Classification")) {
				System.out.println("Dangerous_Goods_Classification is Present in the WebPage.");
			} else {
				System.out.println("Dangerous_Goods_Classification is present in template but missing in webpage.");
			}
		}

		@Test
		public void Global_Harmonized_Standard() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Global_Harmonized_Standard **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Global Harmonized Standard")) {
				System.out.println("Global Harmonized Standard is Present in the WebPage.");
			} else {
				System.out.println("Global Harmonized Standard is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Product_Part_Stability_Document() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Product_Part_Stability_Document **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Product Part Stability Document")) {
				System.out.println("Product_Part_Stability_Document is Present in the WebPage.");
			} else {
				System.out.println("Product_Part_Stability_Document is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Master_Part_Stability_Document() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Master_Part_Stability_Document **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Master Part Stability Document")) {
				System.out.println("Master_Part_Stability_Document is Present in the WebPage.");
			} else {
				System.out.println("Master_Part_Stability_Document is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Notes() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Notes **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Notes")) {
				System.out.println("Notes is Present in the WebPage.");
			} else {
				System.out.println("Notes is present in template but missing in webpage.");
			}
		}
	
		@Test
		public void SAP_BOM_as_Fed() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ SAP_BOM_as_Fed **************************");
			System.out.println("");
			if (driver.getPageSource().contains("SAP BOM as Fed")) {
				System.out.println("SAP_BOM_as_Fed is Present in the WebPage.");
			} else {
				System.out.println("SAP_BOM_as_Fed is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Bill_of_Materials() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Bill_of_Materials **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Bill of Materials")) {
				System.out.println("Bill_of_Materials is Present in the WebPage.");
			} else {
				System.out.println("Bill_of_Materials is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Substitues() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Substitues **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Substitues")) {
				System.out.println("Substitues is Present in the WebPage.");
			} else {
				System.out.println("Substitues is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Related_Specifications() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Related_Specifications **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Related Specifications")) {
				System.out.println("Related Specifications is Present in the WebPage.");
			} else {
				System.out.println("Related Specifications is present in template but missing in webpage");
			}
		}

		@Test
		public void Master_Specifications() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Master_Specifications **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Master Specifications")) {
				System.out.println("Master Specifications is Present in the WebPage.");
			} else {
				System.out.println("Master Specifications is present in template but missing in webpage");
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
		public void Performance_Charcteristic() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Performance_Charcteristic **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Performance Charcteristic")) {
				System.out.println("Performance Charcteristic is Present in the WebPage.");
			} else {
				System.out.println("Performance Charcteristic is present in template but missing in webpage");
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
		public void PQR_View_Supplier_Equivalents() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ PQR_View_Supplier_Equivalents **************************");
			System.out.println("");
			if (driver.getPageSource().contains("PQR View-Supplier Equivalents")) {
				System.out.println("PQR View-Supplier Equivalents is Present in the WebPage.");
			} else {
				System.out.println("PQR View-Supplier Equivalents is present in template but missing in webpage");
			}
		}
		@Test
		public void Material_Produced() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Material_Produced **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Material Produced")) {
				System.out.println("Material_Produced is Present in the WebPage.");
			} else {
				System.out.println("Material_Produced is present in template but missing in webpage.");
			}
		}


		@Test
		public void Security_Classes() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Security_Classes **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Security Classes")) {
				System.out.println("Security Classes is Present in the WebPage.");
			} else {
				System.out.println("Security Classes is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Related_ATS() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Related_ATS **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Related ATS")) {
				System.out.println("Related_ATS is Present in the WebPage.");
			} else {
				System.out.println("Related_ATS is present in template but missing in webpage.");
			}
		}

		@Test
		public void Files() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Files **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Files")) {
				System.out.println("Files is Present in the WebPage.");
			} else {
				System.out.println("Files is present in template but missing in webpage.");
			}
		}
		
		@Test
		public void Certifications() throws Exception {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("");
			System.out.println("************************ Certifications **************************");
			System.out.println("");
			if (driver.getPageSource().contains("Certifications")) {
				System.out.println("Certifications is Present in the WebPage.");
			} else {
				System.out.println("Certifications is present in template but missing in webpage.");
			}
		}

		
	@AfterClass
	public void After() {
		driver.close();
		System.out.println("****************** Successfully Completed ********************");
	}

}
