package Tops.Assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.driverconnection;

public class p008_Mouse_Event {
      public static void main(String[] args) {
		  String url = "http://demo.guru99.com/test/newtours/register.php";
		  WebDriver driver = driverconnection.getDriver(url);
		  
		 
		  WebElement home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		  WebElement flights = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]"));
		  WebElement hotels = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]"));
		  WebElement car_rentals = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]"));
		  WebElement cruises = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(home)
		        .build()
		        .perform();
		  action.moveToElement(flights)
		        .build()
		        .perform();
		  action.moveToElement(hotels)
		        .build()
		        .perform();
		  action.moveToElement(car_rentals)
		        .build()
		        .perform();
		  action.moveToElement(cruises)
		        .build()
		        .perform();
		  
		    
	}
}
