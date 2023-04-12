package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafgroundsDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/select.xhtml");
		Select tool= new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		tool.selectByIndex(2);
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
		driver.findElement(By.xpath("//li[@data-label='Brazil']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h5[text()='Choose the Course']/following::button)[1]")).click();
		driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c']/parent::div)[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-items-wrapper'])[4]/ul/li[4]")).click();
		
		
		
		

	}

}
