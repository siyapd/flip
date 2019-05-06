package main;

import java.io.IOException;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import objects.objects;
import resources.base;

public class landing extends base{
	
	//public static Logger log = LogManager.getLogger(landing.class);

	
	@Test
	public static void getdata() throws IOException, InterruptedException
	{
		driver=invoke();
		//log.info("browser invoke");
	//	log.info("invoked");
		objects o= new objects(driver);
		
		o.close().click();
		o.search().sendKeys("lap");
		Thread.sleep(2000);
		o.search().sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));
		o.go().click();;
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement s=driver.findElement(By.xpath("//*[text()='Price']"));
		js.executeScript("arguments[0].scrollIntoView(true)", s);
		
	/*	Actions a =new Actions(driver);
		a.dragAndDropBy(o.price(), -1000, 0).build().perform();;
	*/	
		
		Select x=new Select(driver.findElement(By.xpath("//*[@class='fPjUPw']")));
		x.selectByValue("15000");
		Thread.sleep(2000);
		o.cl().click();
	}
	
	
	

}
