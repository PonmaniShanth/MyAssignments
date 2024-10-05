package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class BookMyShow {
public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.pvrcinemas.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//p[text()='Quick Book']")).click();
driver.findElement(By.xpath("//span[text()='Cinema']")).click();
driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]")).click();
driver.findElement(By.xpath("//span[(text()='INOX The Marina Mall, OMR, Chennai')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
driver.findElement(By.xpath("(//span[text()='HITLER'])[2]")).click();
driver.findElement(By.xpath("//span[contains(text(),'09:50 PM')]")).click();
driver.findElement(By.xpath("//span[text()='Book']")).click();
driver.findElement(By.xpath("//button[text()='Accept']")).click();
driver.findElement(By.xpath("//span[@id='CL.CLUB|A:15']")).click();
driver.findElement(By.xpath("//button[text()='Proceed']")).click();
String seat = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
System.out.println("Seat Details : " +seat);
String total = driver.findElement(By.xpath("(//span[text()='221.46'])[2]")).getText();
System.out.println("Grand Total : " +total);
driver.findElement(By.xpath("//button[text()='Proceed']")).click();
driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
String title=driver.getTitle();
System.out.println("Page Tile : " +title);
Thread.sleep(5000);
driver.close();
}
}
