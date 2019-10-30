package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestForNmaeLocator {

    public static void main(String[] args) {
        // remember
        // for mac users: you don't need to use webdriver for safari
        // safari has embeded webdriver support
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        // if you want to do in one line, without creating weblement reference variable
        // enter full name
        driver.findElement(By.name("full_name")).sendKeys("Test User");
        // enter email
        driver.findElement(By.name("email")).sendKeys("tets_email@gmail.com");
        // click singn up
        driver.findElement(By.name("wooden_spoon")).click();
        // pause for 3 seconds
        BrowserUtils.wait(3);
        driver.quit();

    }
}
