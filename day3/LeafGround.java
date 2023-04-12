package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[1]")).sendKeys("Aara");
		String attribute = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).getAttribute("value");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).sendKeys(attribute+"Andhra");
		boolean textbox_enabled = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[3]")).isEnabled();
		if(textbox_enabled==false)
		{
			System.out.println("Textbox is disabled");
		}
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String retrive_text = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println("retrived text is"+retrive_text);
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("srest@gmail.com",Keys.TAB);
		WebElement activeElement = driver.switchTo().activeElement();
		if(activeElement.getText().equals("About yourself"))
		{
			System.out.println("Control has moved");
		}
		else
		{
			System.out.println("control has not moved");
		}
		activeElement.sendKeys("I am writing about yourself");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Hello all this is text editor");
		driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following-sibling::div)/div/input")).sendKeys(Keys.ENTER);
		String errorMessage = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		System.out.println("Error message is displaying like this"+errorMessage);
		Point locationOfVariable = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::input")).click();
		Point locationAfterClick = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		if(locationOfVariable.equals(locationAfterClick))
		{
			System.out.println("position is not changed");
		}
		else
		{
			System.out.println("position is changed");
		}
		Thread.sleep(3000);			
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Vineela");
		
		driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[3]")).click();
		String dob="11/11/1987";
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-widget ui-state-default ui-corner-all']")).sendKeys(dob);
		String dateSelection = driver.findElement(By.xpath("//a[@class=' ui-state-default ui-state-active']")).getText();
		if(dob.contains(dateSelection))
		{
			System.out.println("expected date is selected");
		}
		else
		{
			System.out.println("expected date is not selected");
		}
		String enteredno="4";
	    driver.findElement(By.xpath("//input[@class='ui-spinner-input ui-inputfield ui-state-default ui-corner-all']")).sendKeys(enteredno);
	    driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-s']")).click();
	    Thread.sleep(3000);
	    String retrivedno = driver.findElement(By.xpath("//input[@class='ui-spinner-input ui-inputfield ui-state-default ui-corner-all ui-state-filled']")).getText();
	    if(enteredno.equals(retrivedno))
	    {
	    	System.out.println("number is not changed and its not expected");
	    }
	    else
	    {
	    	System.out.println("number is expected and it is expected");
	    }
	    Point initial_location = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation();
	    driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[4]")).sendKeys("3");
	    Point after_location = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation();
	    if(initial_location.equals(after_location))
	    {
	    	System.out.println("location is changed as expected");
	    }
	    else
	    {
	    	System.out.println("location is not changed which is not as expected");
	    }
	    driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
	    boolean keyboard = driver.findElement(By.xpath("//button[text()='t']")).isDisplayed();
	    if (keyboard==true)
	    {
	    	System.out.println("keyboard is displayed");
	    }
	    else
	    {
	    	System.out.println("keyboard is not displayed");
	    }
	    driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("this is a custom toolbar");
	}

}
