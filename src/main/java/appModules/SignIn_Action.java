package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.ExcelUtils;
import utility.Log;

public class SignIn_Action {
	
	public static void Execute(WebDriver driver, String sUserName, String sPassword) throws Exception{
		 
		 //This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
		 Log.info("Username picked from Excel is "+ sUserName );
		 
		 Log.info("Password picked from Excel is "+ sPassword );
		
		 Home_Page.lnk_MyAccount(driver).click();
		 
		 Log.info("Click action performed on My Account link");
		 
		 LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
		 
		 Log.info("Username entered in the Username text box");
		 
		 LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
		 
		 Log.info("Password entered in the Password text box");
		 
		 LogIn_Page.btn_LogIn(driver).click();
		 
		 Log.info("Click action performed on Submit button");
		 
		        }

}
