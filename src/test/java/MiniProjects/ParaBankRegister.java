package MiniProjects;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ParaBankRegister {

    static String url = "https://parabank.parasoft.com/parabank/index.htm";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.linkText("Register")).click();
        System.out.println(driver.getCurrentUrl());

        //Register a new user of ParaBank
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("customer.firstName")).sendKeys("Bank");
        driver.findElement(By.name("customer.lastName")).sendKeys("Customer");
        driver.findElement(By.cssSelector("input[id='customer.address.street']")).sendKeys("45 Guelph Street");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Guelph");
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("N5R 5C3");
        driver.findElement(By.name("customer.ssn")).sendKeys("766-772-2457");
        driver.findElement(By.cssSelector("input[id='customer.username']")).sendKeys("TestCustomer");
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Banking123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Banking123");
        driver.findElement(By.cssSelector("input[value='Register']")).click();

        Assert.assertEquals("Your account was created successfully. You are now logged in.",
                driver.findElement(By.xpath("//div[@id='rightpanel']/p")).getText());

    }
}
