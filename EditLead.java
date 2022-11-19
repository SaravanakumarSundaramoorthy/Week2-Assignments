package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.linkText("Create Lead")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanakumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		WebElement test = driver.findElement(By.id("createLeadForm_dataSourceId"));
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saravana");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saravanakumar1993ss@gmail.com");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation");

		Select source = new Select(test);

		source.selectByValue("LEAD_CONFERENCE");

		WebElement test1 = driver.findElement(By.id("createLeadForm_currencyUomId"));

		Select source1 = new Select(test1);

		source1.selectByValue("INR");

		
		WebElement test2 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));

		Select source2 = new Select(test2);

		source2.selectByVisibleText("United States");

		
	    WebElement test3=driver.findElement(By.name("generalStateProvinceGeoId"));

		Select dd=new Select(test3);
		
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit Lead Testing");
		driver.findElement(By.name("submitButton")).click();
		String resultofpage=driver.getTitle();
		System.out.println("The Title is "+ resultofpage);
	}

}
