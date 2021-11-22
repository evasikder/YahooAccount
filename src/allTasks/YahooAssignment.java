package allTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class YahooAssignment {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "\\Users\\eva07\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//String URL="https://www.yahoo.com";
		//driver.get(URL);
		
		 
		// driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String URL="https://www.yahoo.com";
		 driver.get(URL);
		 driver.findElement(By.id("root_1")).click();
		 driver.findElement(By.className("signup")).click();
		 driver.findElement(By.id("usernamereg-firstName")).sendKeys("abc");
		 driver.findElement(By.id("usernamereg-lastName")).sendKeys("deg");
		 driver.findElement(By.id("usernamereg-yid")).sendKeys("abcdeg122");
		 driver.findElement(By.id("usernamereg-password")).sendKeys("asend123");
		 driver.findElement(By.id("usernamereg-phone")).sendKeys("9293544029");
		
		 //WebElement month = driver.findElement(By.id("usernamereg-month"));
		 
		 //Select select = new Select(month);
		 //select.selectByVisibleText("july");
		 
		 driver.findElement(By.id("usernamereg-month")).sendKeys("July");
		 driver.findElement(By.id("usernamereg-day")).sendKeys("21");
		 driver.findElement(By.id("usernamereg-year")).sendKeys("1998");
		 driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("Female");
		 //driver.findElement(By.id("reg-submit-button")).click();

	}

}
