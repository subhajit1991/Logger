package automationFramework;

import org.testng.annotations.Test;

import appModules.SignIn_Action;
import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;



public class Apache_POI_TC {
	
	private static WebDriver driver = null;
  @Test
  public void f() throws Exception {
	  
	  
	  
	  
	  
	         //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
	  
	         ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
	  
	         driver = new ChromeDriver();
	  
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	         driver.get(Constant.URL);
	  
	         SignIn_Action.Execute(driver, null, null);
	  
	         System.out.println("Login Successfully, now it is the time to Log Off buddy.");
	  
	         Home_Page.lnk_LogOut(driver).click(); 
	  
	         driver.quit();
	  
	         //This is to send the PASS value to the Excel sheet in the result column.
	  
	         ExcelUtils.setCellData("Pass", 1, 3);
	  
	  }


  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
