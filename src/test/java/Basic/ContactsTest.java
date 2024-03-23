package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactsTest {
	
	@Test
	public void CreateContactsTest() {
			//Launch the browser
				WebDriver driver = new ChromeDriver();
				//Launch the application
				driver.get("http://localhost:8888/");
				//Login to application
				driver.findElement(By.name("user_name")).sendKeys("admin");
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
				
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	
	
	}

}
