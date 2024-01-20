package Tops.Assigment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.driverconnection;

public class p011_Hyperlinks {
   public static void main(String[] args) {
	   String url = "https://demo.guru99.com/test/web-table-element.php";
	   WebDriver driver = driverconnection.getDriver(url);
	   
	   List<WebElement> hyperlink = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
	   System.out.println("Total hyperlinks : "+hyperlink.size());

   
}
}
