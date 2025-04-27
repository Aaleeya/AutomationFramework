package MiniProjects;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankRegister {

    static String url = "https://parabank.parasoft.com/parabank/index.htm";

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Register")).click();
        System.out.println(driver.getCurrentUrl());


    }
}
