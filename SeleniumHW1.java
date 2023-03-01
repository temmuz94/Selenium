import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-message")).sendKeys("imamhatiplerkapatilsin");
        driver.findElement(By.className("btn-default")).click();


    }
}
