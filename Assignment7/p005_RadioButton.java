package Tops.Assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.driverconnection;

public class p005_RadioButton {
      public static void main(String[] args) {
		 String url = "https://demo.guru99.com/test/radio.html";
		 WebDriver driver = driverconnection.getDriver(url);
		 
		 driver.findElement(By.id ("vfb-7-1")).click();
		 driver.findElement(By.id("vfb-7-2")).click();
		 driver.findElement(By.id("vfb-7-3")).click();
		 
	}
}
