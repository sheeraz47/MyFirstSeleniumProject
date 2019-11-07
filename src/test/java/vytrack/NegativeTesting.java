package vytrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NegativeTesting {

    public static void main(String[] args){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.name("_username")).sendKeys("storemanager");

        driver.findElement(By.name("_password")).sendKeys("UserUser");
        driver.findElement(By.id("_submit")).click();

        WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div"));
        String expectedMessage = "Invalid user name or password.";
        String actualMessage = confirmationMessage.getText();
        if(expectedMessage.equals((actualMessage))){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        BrowserUtils.wait(3);
        driver.quit();

    }
}


