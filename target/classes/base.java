package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sun.security.action.GetBooleanSecurityPropertyAction;

public class base {
	
public static	Logger log=LogManager.getLogger(base.class);
	
	public static WebDriver driver;
	
	@Test
	public static WebDriver invoke() throws IOException
	{
		Properties p=new Properties();
		FileInputStream src=new FileInputStream("E:\\java\\eclipse_workspace\\flipcartproject\\src\\main\\java\\resources\\file.properties");
		p.load(src);
		
		if(p.getProperty("browser").equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			log.info("invoked");
				}
		return driver;
	}
	
	
	public void sreenshoot(String result) throws IOException
	{
		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\"+result+ "screen.png"));
	}




}
