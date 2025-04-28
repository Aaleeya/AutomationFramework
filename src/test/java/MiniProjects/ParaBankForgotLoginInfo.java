package MiniProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankForgotLoginInfo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgot login info?")).click();
        driver.findElement(By.id("firstName")).sendKeys("Bank");
        driver.findElement(By.id("lastName")).sendKeys("Customer");
        driver.findElement(By.id("address.street")).sendKeys("45 Guelph Street");
        driver.findElement(By.cssSelector("input[id*='city']")).sendKeys("Guelph");
        driver.findElement(By.xpath("//input[contains(@id,'state')]")).sendKeys("Florida");
        driver.findElement(By.cssSelector("input[id='address.zipCode']")).sendKeys("N5R 5C3");
        driver.findElement(By.cssSelector("#ssn")).sendKeys("766-772-2457");
        driver.findElement(By.cssSelector("input[value*='Find']")).click();
    }
}
