package Tops.Assigment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basic.driverconnection;

public class p004_GmailRegister {
       public static void main(String[] args) {
	
      String url = "https://accounts.google.com/AccountChooser/signinchooser?service=CPanel&theme=glif&flowName=GlifWebSignIn&flowEntry=AccountChooser";
      WebDriver driver = driverconnection.getDriver(url);
      
      driver.findElement(By.tagName("Create account")).click();
      
    	   
    	   
    	   
    	   
    	   
    	   
	}
}
