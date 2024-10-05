package homeassignmentweek2day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcoount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("requiredField"));
		driver.findElement(By.id("accountName")).sendKeys("Project");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(3);
		WebElement dd1 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByVisibleText("S-Corporation");
		WebElement dd2 = driver.findElement(By.id("dataSourceId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		WebElement dd3 = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByIndex(6);
		WebElement dd4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.partialLinkText("Create Account Ignoring")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement text3 = driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr[1]/td[2]/span"));
		String text = text3.getText();
		System.out.println(text);
		if(text.contains("Project")) {
			System.out.println("Account name displayed correctly");
		}else {
			System.out.println("Account name is not displayed");
		}
		driver.close();

		
		
		
		
		
		
	}

}
