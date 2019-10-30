package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/forgot_password");
            String expectedTitle = driver.getTitle();
            // Step 1. Open inspector in chrome and find locator for the element
            // Step 2. Create object of WebElement
            // Step 3. Use webelement
            WebElement button = driver.findElement(By.id("form_submit"));
            //to click on the element
            button.click();
            //read title again, after clicking
            String actualTitle = driver.getTitle();
            // in this way, we're makin sure that after clicking
            // we stay on the same page
            if(actualTitle.equals(expectedTitle)){
                System.out.println("Test passed");
            }else{
                System.out.println("Test Failed");
                System.out.println("Expected title: "+expectedTitle);
                System.out.println("Actual title: "+actualTitle);
            }
            //wait for 2 seconds
            BrowserUtils.wait(2);
            driver.close();
        }
    }
