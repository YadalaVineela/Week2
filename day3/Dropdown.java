package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Syntel");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Max");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Taylor");
		Select source= new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByIndex(4);
		Select marketCampaign= new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		marketCampaign.selectByVisibleText("Automobile");
		Select ownership= new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		ownership.selectByValue("OWN_SCORP");
		driver.findElement(By.name("submitButton")).click();
	}

}
