package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blazemeter {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://nikepsr.o9solutions.com/");
	driver.manage().window().maximize();
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
	
//	WebElement StartDateTime = driver.findElement(By.xpath("//button[@aria-controls='startdate_timeview']"));
//	StartDateTime.click();
	
	WebElement timeText = driver.findElement(By.id("timetext"));
	timeText.clear();
	Thread.sleep(1000);
	timeText.sendKeys("3");
	
//	Thread.sleep(10000);
//	
//	WebElement StartDate = driver.findElement(By.id("startdate"));
//	
//	StartDate.sendKeys("2025-06-18 15:14");
	
	
//	WebElement endDate = driver.findElement(By.id("enddate"));
//	endDate.sendKeys("2025-06-18 15:20");
	
	WebElement Apply = driver.findElement(By.id("applybutton"));
	Apply.click();
	
	WebElement RunTheLog = driver.findElement(By.xpath("//button[@class = 'start o9con o9con-20 o9con-play-square enabled toolbar-button']"));
	RunTheLog.click();
	
	Thread.sleep(3000);
	
	WebElement DownloadCSV = driver.findElement(By.xpath("//span[text()='Download Full Logs as CSV']"));
	DownloadCSV.click();
	
}
}
