package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.id("email")).sendKeys("temmuz");
     driver.findElement(By.id("pass")).sendKeys("musakka");
     driver.findElement(By.linkText("Create new account")).click();
driver.findElement(By.partialLinkText(" password?")).click();
driver.quit();
    }
}
