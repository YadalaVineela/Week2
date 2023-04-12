package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Neela");
		driver.findElement(By.id("lastNameField")).sendKeys("Pujith");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Helloooo");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Neela@testleaf.com");
		Select state= new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		state.selectByIndex(1);	
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("its a notes section");
		driver.findElement(By.name("submitButton")).click();	
		
	}

}
