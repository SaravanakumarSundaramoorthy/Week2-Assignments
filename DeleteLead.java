package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Find Leads")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Name and ID")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("firstName")).sendKeys("Saravanakumar");
		driver.findElement(By.className("x-btn-text")).sendKeys(Keys.ENTER);
		
	}

}
