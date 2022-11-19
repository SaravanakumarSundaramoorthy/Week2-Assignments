package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Saravanakumar");
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("S");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("saravana2193ss@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("saravana2193ss@gmail.com");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("1234586hgi");
		WebElement findElement1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select day=new Select (findElement1);
		
		day.selectByVisibleText("21");
		
WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select month=new Select (findElement2);
		
		month.selectByVisibleText("Feb");
		
WebElement findElement3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select year=new Select (findElement3);
		
		year.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][2]")).click();
		
	}

}
