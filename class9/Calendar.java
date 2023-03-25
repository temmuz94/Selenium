package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.delta.com/");
        driver.manage().window().maximize();
        // click on the calendar
        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();
        // get the month from the calendar
        WebElement monthElement = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        // get the next button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
        // click on next button until you find the right month
        boolean isFound = false;
        while (!isFound) {
            String month = monthElement.getText();
            if (month.equalsIgnoreCase("January")) {
                // select the day
                isFound = true;
            } else {
                next.click();
            }
        }
    }
}
