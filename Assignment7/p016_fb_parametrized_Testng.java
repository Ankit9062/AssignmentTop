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
	  @Test(dataProvider = "aakib" )
      public void login () {
    	  WebElement emailele = driver.findElement(By.id("email"));
    	  emailele.clear();
    	  emailele.sendKeys(email);
    	  WebElement passele = driver.findElement(By.id("pass"));
    	  passele.clear();
    	  passele.sendKeys(password);
    	  
}
    @DataProvider(name = "aakib")
    public static List<Object[]> getdata () {
    	 Object obj[][] = new Object[4][2];
    	 obj [0][0] = "sandhiaakib5@gmail.com";
    	 obj [0][1] = "S@ndhi9596";
    	 
    	 obj [1][0] = "9265457854";
    	 obj [1][1] = "9265457854";
    	 
    	 obj [2][0] = "Aakib9596";
    	 obj [2][1] = "A@kib9596";
    	 
    	 obj [3][0] = "salimhusen";
    	 obj [3][1] = "s@ndhi9596";
    			 
    	return Arrays.asList(obj);
    	
    	
    	
    	
    }



}
