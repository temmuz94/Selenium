package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendar1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.delta.com/");
        driver.manage().window().maximize();

        // Click on the calendar
        WebElement calendar = driver.findElement(By.xpath("//span[text()='Depart']"));
        calendar.click();

        // Get the month from the calendar
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        // Get the next button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

        // Click on next button until you find the right month
        boolean isFound = false;
        while (!isFound) {
            String monthText = month.getText();
            if (monthText.equalsIgnoreCase("January")) {
                // Select the day
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for (WebElement day : days) {
                    String day_text = day.getText();
                    if (day_text.equalsIgnoreCase("20")) {
                        day.click();
                        isFound = true;
                        break;
                    }
                }
            } else {
                next.click();
            }
        }
    }
}
