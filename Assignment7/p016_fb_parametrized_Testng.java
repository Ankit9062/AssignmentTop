package Tops.Assigment_selenium;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basic.driverconnection;

public class p016_fb_parametrized_Testng {
	WebDriver driver ;
	String email ,password;
	
      public p016_fb_parametrized_Testng(String email, String password) {
		super();
		this.email = email;
		this.password = password;
}
      @BeforeTest
	  public void browser () {
    	  String url = "https://www.facebook.com";
    	  driver = driverconnection.getDriver(url);
    	    }
	  @Test(dataProvider = "Akit" )
      public void login () {
    	  WebElement emailele = driver.findElement(By.id("email"));
    	  emailele.clear();
    	  emailele.sendKeys(email);
    	  WebElement passele = driver.findElement(By.id("pass"));
    	  passele.clear();
    	  passele.sendKeys(password);
    	  
}
    @DataProvider(name = "Akit")
public static List<Object[]> getdata () {
	Object obj[][] = new Object[3][2];
	obj [0][0] = "APatel@gmail.com";
	obj [0][1] = "Ap@90-62";
	 
    obj [1][0] = "8469181334";
    obj [1][1] = "9925903699";
    
    obj [2][0] = "PatelShiv";
    obj [2][1] = "8469181334";
    
    		
   return Arrays.asList(obj); 		
			
}



}
