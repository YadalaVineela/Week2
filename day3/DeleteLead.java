package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");		
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9867589078");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement leadID = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a"));
		String leadNo = leadID.getText();
		leadID.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys(leadNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement displaytext = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text = displaytext.getText();
		if(text.equals("No records to display"))
		{
			System.out.println("Lead is deleted");
		}
		
	}

}
