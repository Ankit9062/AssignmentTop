package Tops.Assigment_selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

import basic.driverconnection;

public class p006_fb_logo {
  public static void main(String[] args) {
	     String url = "https://www.facebook.com";
	     WebDriver driver = driverconnection.getDriver(url);
	     
	     String title = driver.getTitle();
	     System.out.println("facebook title :"+title);
}
}
