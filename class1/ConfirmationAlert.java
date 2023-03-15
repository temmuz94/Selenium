package class1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //Use switch to//
       Alert alert= driver.switchTo().alert();
       Thread.sleep(4000);
       alert.dismiss();
       //reject it
       Thread.sleep(2000);
       //Clicks on prompt alert button
       driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);

       //Accept it
       alert.accept();
       driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
       Thread.sleep(2000);
        alert.sendKeys("fu");
        alert.accept();


    }
}
