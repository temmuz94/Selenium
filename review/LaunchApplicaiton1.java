package review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApplicaiton1 {
    public static void main(String[] args) {
        //use it if you do not have the latest Selenium
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");

}}
