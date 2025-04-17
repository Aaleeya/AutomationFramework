package MiniProjects;

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

            driver.findElement(By.cssSelector("input[placeholder = 'Username']")).sendKeys("Admin");
            driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

        String dashboardURL= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        if(driver.getCurrentUrl().contentEquals(dashboardURL)){
            System.out.println("User has successfully logged in to Orange HRM");
        }
        else{
            driver.findElement(By.cssSelector("p[class*='orangehrm-login-forgot-header']")).click();
            System.out.println(driver.getCurrentUrl());
            driver.findElement(By.name("username")).sendKeys("Admin");
        }

        driver.quit();
    }
}
