package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdCss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button")).click();
        //wait for the implement the explicit and then get the text. Because the page is dynamic
        WebDriverWait wait=new WebDriverWait(driver,20);
        //once the element visible gets the text

    }
}



