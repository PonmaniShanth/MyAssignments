package homeassignmentweek2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ponmani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ashokan");
        driver.findElement(By.id("createLeadForm_dataSourceId"));
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Page title is : " +title);
		if (title.contains("View Lead")) 
		System.out.println("Title is verified");
		else {
			System.out.println("Title is not verified");
		}
		driver.close();
}

}
