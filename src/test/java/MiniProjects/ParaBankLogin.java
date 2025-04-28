package MiniProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankLogin {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("TestCustomer");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Banking123");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();

    }
}
