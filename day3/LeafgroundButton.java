package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button")).click();
		String title = driver.getTitle();
		if(title.equals("Dashboard"))
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println("title is not matched");
		}
		driver.navigate().back();
		boolean button_enabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button")).isEnabled();
		if(button_enabled==true)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is disabled");
		}
		Point location = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following-sibling::button")).getLocation();
		
		System.out.println("location of button is"+location);
	}

}
