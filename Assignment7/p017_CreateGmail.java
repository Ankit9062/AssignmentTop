package assignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class p017_CreateGmail {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&ifkv=ASKXGp05Yh3QEaz3Jj5iV_atVumb3D8QkcjA2O299I7cIkVhEkClQRfWB4slmgrHotUgd1TKKDaOHw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-418681476%3A1705555152994303&theme=glif";
		WebDriver driver= driverchrome.getDriver(url);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='nM4rkc']/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='yDmH0d']/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div/ul/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Priyansh");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Patel");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("day")).sendKeys("18");
		
		WebElement month= driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("July");
		Thread.sleep(2000);
		
		driver.findElement(By.id("year")).sendKeys("2022");
		
		WebElement gndr=  driver.findElement(By.id("gender"));
		
		Actions action = new Actions(driver);
		action.click(gndr)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ARROW_DOWN).click()
		.build()
		.perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		try {driver.findElement(By.className("SCWude")).click();
		Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("radio");
		}
		finally {
		driver.findElement(By.name("Username")).sendKeys("p9428842525patel000");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Passwd")).sendKeys("451216@546as");
		Thread.sleep(2000);
		driver.findElement(By.name("PasswdAgain")).sendKeys("9428842525@s");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		
		
		
		
		
		
}	
}
}
