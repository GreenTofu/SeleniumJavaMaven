package crmLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Relate_Xpath_6_10 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://crm.anhtester.com/admin/authentication";
        String username = "admin@example.com";
        String password = "123456";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the URL
        driver.get(url);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(password);

        //xPath 7 - using descendant
        driver.findElement(By.xpath("//div[@class='form-group']/descendant::button")).click();

        Thread.sleep(2000);

        // xPath 6 - using ancestor
        driver.findElement(By.xpath("//span[normalize-space()='Projects']/ancestor::a")).click();

        //xPath 8 - using preceding and following
        //find div tag, then above (same level with above div tag) the div tag, find the a tag
        driver.findElement(By.xpath("//div[@class='panel_s tw-mt-2 sm:tw-mt-4']/preceding::a[normalize-space()='New Project']")).click();

        //xPath 9 - using following-sibling
        driver.findElement(By.xpath("//label[@for='name']/following-sibling::input")).sendKeys("Test Project");

        //xPath 10 - using parent, child
        driver.findElement(By.xpath("//input[@id='name']/parent::div"));

        driver.quit();
    }
}
