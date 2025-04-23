package crmLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Relate_Xpath_1_5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://crm.anhtester.com/admin/authentication";
        String username = "admin@example.com";
        String password = "123456";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the URL
        driver.get(url);

        //xPath 1 - using @attribute
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

        //xPath 3 - using contains()
        driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(password);

        //xPath 2 - using text(), normalize-space()
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        Thread.sleep(2000);

        // navigate to Customers page and clicking new customer
        //xPath 4 - using starts-with()
        driver.findElement(By.xpath("//a[span[starts-with(normalize-space(),'Customers')]]")).click();
        driver.findElement(By.xpath("//a[@class='btn-primary' or normalize-space()='New Customer']")).click();
        Thread.sleep(1000);

        //xPath 5 - using or and
        driver.findElement(By.xpath("//div[@class='panel_s']"));

        driver.quit();
    }
}
