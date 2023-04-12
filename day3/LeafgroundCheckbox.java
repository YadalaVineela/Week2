package week2.day3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		

	}

}
