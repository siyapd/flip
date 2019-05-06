package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class objects {
	
	public static WebDriver driver;
	
	
	public objects(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By close=By.xpath("//div[@class='_3Njdz7']/button");
	By search =By.xpath("//div[@class='col-12-12 _2tVp4j']/div/input");
	By go =By.xpath("//button[@class='vh79eN']");
	By price=By.xpath("//*[text()='CATEGORIES']");
	By cl=By.xpath("//section[@class='_1gjf4c D_NGuZ']/div[2]/div/div/div/div/label/div");
	
	
	public WebElement price()
	{
		 return driver.findElement(price);
	}
	public WebElement cl()
	{
		 return driver.findElement(cl);
	}
	
	public WebElement close()
	{
		 return driver.findElement(close);
	}
	public WebElement search()
	{
		 return driver.findElement(search);
	}
	public WebElement go()
	{
		 return driver.findElement(go);
	}
	
	
	

}
