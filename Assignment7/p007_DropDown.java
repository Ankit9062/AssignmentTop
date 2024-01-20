package Tops.Assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basic.driverconnection;

public class p007_DropDown {
    public static void main(String[] args) {
		  String url = "http://demo.guru99.com/test/newtours/register.php";
		  WebDriver driver = driverconnection.getDriver(url);
		  
		  WebElement dropdown = driver.findElement(By.name("country"));
		  Select DD = new Select(dropdown);
		  DD.selectByVisibleText("UNITED STATES");
				  
	}
}
