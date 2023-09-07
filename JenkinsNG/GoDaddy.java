/* A Simple TestNG Program that Validates Title of the GoDaddy.com page title 
 * @author PratikS (Expleo Group)
 * @since JDK 17.1.21 (7/9/2023)
 */


package com.selenium.JenkinsNG;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class GoDaddy {
	WebDriver driver;
	@Test
  public void f1() {
	  driver = new ChromeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.godaddy.com/en-in");  
	  driver.close();
  }
	WebDriver driver1;
	@Test(priority = 1)
	  public void f2() {
		  driver1 = new ChromeDriver();
		  driver1.get("https://www.godaddy.com");
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  WebElement domainClk = driver1.findElement(By.xpath("//button[@class='p1td6cxw']"));
		  domainClk.click();
		  driver1.findElement(By.xpath("//button[@class='fqpukcf']")).click();
		  driver1.findElement(By.xpath("//a[@class='p1yxuuwm']")).click();		  
		  Assert.assertEquals(driver1.getCurrentUrl(),"https://www.godaddy.com/en-in");
	      	 driver1.close();
	}
	
       WebDriver driver3;
	   @Test(priority = 2)
       public void f3() {
	   driver3 = new ChromeDriver();
	   driver3.get("https://www.godaddy.com/en-in");
	   driver3.manage().window().maximize();
	   Assert.assertEquals(driver3.getCurrentUrl(),"https://www.godaddy.com/en-in");  
	  driver3.close();
  }
	   
	   WebDriver driver4;
		@Test(priority = 3)
	  public void f4() {
		  driver4 = new ChromeDriver();
		  driver4.get("https://www.godaddy.com/en-in");
		  driver4.manage().window().maximize();
		  WebElement domainClk2 = driver4.findElement(By.xpath("//button[@class='p1td6cxw']"));
		  domainClk2.click();
		  driver4.findElement(By.xpath("//a[@class='puahq95']")).click();
		  driver4.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		// WebElement helpNo = driver4.findElement(By.xpath("//a[@class='support-footer-number']"));
		 WebElement helpNo=driver4.findElement(By.partialLinkText("040-67607600"));
		  System.out.println(helpNo.getText());
		  driver4.close();
	  }
		
	
	  
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  
  }

}
