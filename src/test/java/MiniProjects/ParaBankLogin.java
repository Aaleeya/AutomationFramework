package MiniProjects;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParaBankLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("TestCustomer");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Banking123");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();

        Thread.sleep(5000);
        //Click on Account Link and view account activity
        driver.findElement(By.partialLinkText("17562")).click();
        Thread.sleep(5000);
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("All");
        driver.findElement(By.cssSelector(".button")).click();

        //Open a new Savings account
        Thread.sleep(2000);
        driver.findElement(By.linkText("Open New Account")).click();
        Select type = new Select(driver.findElement(By.id("type")));
        type.selectByVisibleText("SAVINGS");
        driver.findElement(By.cssSelector("input[value='Open New Account']")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Account Opened!", driver.findElement(By.className("title")).getText());

    }
}
