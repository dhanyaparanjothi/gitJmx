package jenkins_radiant.Jenkins;
import java.util.HashMap;

import java.util.Map;
 import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		String downloadFilepath = "C:\\Users\\LENOVO\\.jenkins\\workspace\\log\\logResult";
 
    // Configure Chrome options
    Map<String, Object> prefs = new HashMap<>();
     prefs.put("download.default_directory", downloadFilepath);
     prefs.put("download.prompt_for_download", false);
     prefs.put("download.directory_upgrade", true);
     prefs.put("safebrowsing.enabled", true); // Optional but helps prevent Chrome warnings
 
     ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", prefs);
	WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://nikepsr.o9solutions.com/");
		driver.manage().window().maximize();
		
		System.out.println("Done");
		WebElement Username = driver.findElement(By.id("Username"));
		Username.sendKeys("test1@aptesting.com");
		
		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys("Perf@1234");
		
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		
		Thread.sleep(20000);
		
		
		WebElement Menu = driver.findElement(By.id("header-menu"));
		Menu.click();
		
		Thread.sleep(5000);
		WebElement Debugging = driver.findElement(By.xpath("//span[text()='Debugging']"));
		Debugging.click();
		
		Thread.sleep(10000);
		
		WebElement Filter = driver.findElement(By.xpath("//button[@aria-controls='logFilters']"));
		Filter.click();
		

		
		WebElement timeText = driver.findElement(By.id("timetext"));
		timeText.clear();
		Thread.sleep(1000);
		timeText.sendKeys("5");
		

		WebElement Apply = driver.findElement(By.id("applybutton"));
		Apply.click();
		
		WebElement RunTheLog = driver.findElement(By.xpath("//button[@class = 'start o9con o9con-20 o9con-play-square enabled toolbar-button']"));
		RunTheLog.click();
		
		Thread.sleep(30000);
		
		WebElement DownloadCSV = driver.findElement(By.xpath("//span[text()='Download Full Logs as CSV']"));
		DownloadCSV.click();

		
		
	}
	}
