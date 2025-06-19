package selenium.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhanavel.ramesh\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nikepsr.o9solutions.com/Kibo2/Account/Login?ReturnUrl=%2Fkibo2&ia=0");
		driver.manage().window().maximize();
		
//		FileInputStream fis = new FileInputStream(new File("C:\\Users\\dhanavel.ramesh\\general\\general\\MFP_Username\\APLA_sel.xlsx"));
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		//XSSFRow row = sheet.getRow(0);
//        int rowCount = sheet.getPhysicalNumberOfRows();
        
        for (int i = 5002; i < 5030; i++) {
        	 //String User = sheet.getRow(i).getCell(0).getStringCellValue();
        	
        	WebElement Username = driver.findElement(By.id("Username"));
    		Username.sendKeys("test"+i+"@testing.com");
    		
    		 System.out.println("test"+i+"@testing.com");
    		WebElement password = driver.findElement(By.id("Password"));
    		password.sendKeys("Welcome@123");
    		
    		WebElement login = driver.findElement(By.id("loginButton"));
    		login.click();
    		
    		Thread.sleep(1000);
    		
    		WebElement oldPassword = driver.findElement(By.id("OldPassword"));
    		oldPassword.sendKeys("Welcome@123");
    		
    		WebElement newPassword = driver.findElement(By.id("NewPassword"));
    		newPassword.sendKeys("Pass@1234");
    		
    		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
    		confirmPassword.sendKeys("Pass@1234");
    		
    		WebElement update = driver.findElement(By.xpath("//button[text()='Update']"));
    		update.click();

           System.out.println("Update completed");
           Thread.sleep(1000);
			
		}
         //workbook.close();
         driver.quit();
	
			}

}
