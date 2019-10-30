package tests.day2;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //to maximize the driver
        driver.manage().window().maximize();
        driver.get("http://google.com");
        // we want to naviagte, to the different page
        //within the same browser
        // URL can be pass as an object
        //or as a string
        // we use string
        driver.navigate().to("http://amazon.com");
        //if i want to comeback, to the previous page
        driver.navigate().back();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        // selenium cannot claose bre

    }


}
