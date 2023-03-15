package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StartsWith {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

// Loop through all links and check if href attribute starts with "amazon"
        for(WebElement link : allLinks) {
            String href = link.getAttribute("href");
            System.out.println(link);
            if(href != null && href.startsWith("facebook")) {
                System.out.println(href);
            }
        }driver.close();

    }
}
