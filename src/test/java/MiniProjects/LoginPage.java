package MiniProjects;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.time.Duration;

public class LoginPage {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String username = getUsername(driver);
        String pwd = getPassword(driver);

            driver.findElement(By.cssSelector("input[placeholder = 'Username']")).sendKeys(username);
            driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys(pwd);
            driver.findElement(By.xpath("//button[@type='submit']")).click();

        String dashboardURL= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        Assert.assertEquals(dashboardURL, driver.getCurrentUrl());

        if(driver.getCurrentUrl().contentEquals(dashboardURL)){
            System.out.println("User has successfully logged in to Orange HRM");
        }
        else{
            driver.findElement(By.cssSelector("p[class*='orangehrm-login-forgot-header']")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.cssSelector("button[class*='button--reset']")).click();
        }

        driver.quit();
    }

    public static String getUsername(WebDriver driver){
        String usernameText = driver.findElement(By.xpath(
                "//p[@class='oxd-text oxd-text--p'][1]")).getText();
        return usernameText.split(":")[1].trim();
    }

    public static String getPassword(WebDriver driver){
        String passwordText = driver.findElement(By.xpath("//div/p[2]")).getText();
        return passwordText.split(":")[1].trim();
    }
}
