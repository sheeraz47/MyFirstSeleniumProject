package vytrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class VyTrackTesting {

    /*
   Go to the login page of VyTrack
   •Enter valid credential (can be any role)
   •Click login button
   •Verify that the user login successfully
    */

    public static void main(String[] args) {
        // import import the wBrowserFactory class which have all the browsers
        // getDriver() method will return webdriver object
        WebDriver driver = BrowserFactory.getDriver("firefox");

        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.name("_username")).sendKeys("storemanager60");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PAss");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected result "+expectedTitle);
            System.out.println("Actual result "+ actualTitle);
        }
        driver.quit();

    }
}
