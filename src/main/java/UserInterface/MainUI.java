package UserInterface;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MainUI {

	public WebDriver driver;
	public Properties property;
	
	public void invokeBrowser(String browserName) {

	
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");

				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Mozila")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\src\\\\main\\\\java\\\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.setProperty("webdriver.opera.driver",System.getProperty("user.dir") + "\\src\\main\\java\\resources\\operadriver.exe");
				driver = new OperaDriver();
			}
		 

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		
	}
	
	/* =================Open URL================== */
	public void openURL() {
			
		driver.get("https://www.rediff.com/");
	}
	

	
	/* =================Closing Browser================== */
	public void tearBrowser() {
		driver.close();
	}

	/* =================Closing Browser Instance================== */
	public void quitBrowser() {
		driver.quit();
	}
	
	
}
