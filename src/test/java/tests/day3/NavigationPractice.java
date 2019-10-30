package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NavigationPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize(); // to maximize browser window
        driver.get("http://google.com");
        BrowserUtils.wait(3);
        // the wait for 3 sec
        // this is not custom method
        // since method is static , we use class name to call the method
        // as a parameter, we provide number of second (time in seconds)
        System.out.println(driver.getTitle());
        driver.navigate().to("http://amazon.com");
        //navigate back to google(previous URL)
        driver.navigate().back();
        //navigate forward to amazon()
        driver.navigate().forward();
        // refresh/reload the webpage
        driver.navigate().refresh();
        // shutdown browser
        driver.quit();
        //
        driver.get("http://google.com");
    }
}
