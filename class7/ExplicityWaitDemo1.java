package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        //wait till the alert is present
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

    }
}
