package homeassignmentweek4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingLeaftaps {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(childWindow.get(1));
		driver.findElement(By.linkText("DemoCustomer")).click();
		driver.switchTo().window(childWindow.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> childWindow1=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(childWindow1.get(1));
		driver.findElement(By.linkText("DemoLBCust")).click();
		driver.switchTo().window(childWindow1.get(0));
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();	
		System.out.println("Title of the page : " +title);
		driver.quit();
	}

}
