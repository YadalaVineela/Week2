package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Neethu");
		driver.findElement(By.name("lastname")).sendKeys("chandra");
		driver.findElement(By.name("reg_email__")).sendKeys("789678");
		driver.findElement(By.id("password_step_input")).sendKeys("XXXXhj");
		Select day=new Select(driver.findElement(By.id("day")));
		Select month= new Select(driver.findElement(By.id("month")));
		Select year= new Select(driver.findElement(By.id("year")));
		day.selectByValue("12");
		month.selectByValue("12");
		year.selectByValue("2012");
		driver.findElement(By.name("sex")).click();		

	}

}
