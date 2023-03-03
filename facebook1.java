import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       driver.findElement(new By.ByCssSelector("a[class^='_'")).click();
        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));

        firstName.sendKeys("hasan");
    }

}
