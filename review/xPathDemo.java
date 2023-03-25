package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xPathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.espncricinfo.com/series/australia-in-india-2022-23-1348637/india-vs-australia-2nd-odi-1348657/full-scorecard");
            driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[3]/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody/tr[5]/td[3]/strong"));



        }
    }
