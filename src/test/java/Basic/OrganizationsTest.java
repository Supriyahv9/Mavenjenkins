package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrganizationsTest {
	
	@Test
	public void CreateOrganizationsTest() throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Launch the application
		driver.get("http://localhost:8888/");
		//Login to application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("Intel11");
		
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		
		WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Support Group");
		
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();	
	
		Thread.sleep(2000);
		
		//Mouse hover on image
		WebElement image = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		Actions a = new Actions(driver);
		a.moveToElement(image).perform();
	
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}

}
