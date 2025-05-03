package MiniProjects;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("TestCustomer");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Banking123");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();

        driver.findElement(By.xpath("//tbody/tr/td/a")).click();
        Thread.sleep(2000);
        Assert.assertEquals("56634", driver.findElement(By.id("accountId")));

    }
}
