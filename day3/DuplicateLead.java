package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("Taylor@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement nameofLead = driver.findElement(By.xpath("(//div[contains(@class,'firstName')])[2]/a"));
		Thread.sleep(3000);
		String name = nameofLead.getText();
		nameofLead.click();		
		System.out.println(name);	
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String headerTitle = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(headerTitle);
		driver.findElement(By.name("submitButton")).click();
		WebElement duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp"));
		String duplicate = duplicateLeadName.getText();
		if(name.equals(duplicate))
		{
			System.out.println("duplicate lead name is same as created lead");
		}
	}

}
