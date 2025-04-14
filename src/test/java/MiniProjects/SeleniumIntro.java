package MiniProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

    public static void main(String[] args) {

        //Invoking Browser
        //Chrome-> ChromeDriver -> Methods
        //WebDriver interface which sets the rules for all browser
        //group of methods with no implemention- classes implement the methods
        //WebDriver methods + browser specific class methods =
        // ChromeDriver driver = new ChromeDriver();
        //Launch Chrome browser
        //1. Step to invoke chrome driver   2. Using SeleniumManager- would invoke appropriate driver of latest version
        WebDriver driver = new ChromeDriver(); // we want to create an object which only invokes webdriver implemented methods

        //Firfox Browser launch
        //WebDriver driver = new FirefoxDriver();

        //Edge browser launch
        //WebDriver driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.contentEquals("OrangeHRM")){
            System.out.println("Title match. Test Passed");
        }
        else{
            System.out.println("No match found. Test Failed");
        }
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.close();
    }
}
