package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders");
        //        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test",Keys.ENTER);
        //take the ss
        TakesScreenshot ss=(TakesScreenshot) driver;
        //save the ss as a File
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        System.out.println(sourceFile);
        //save the file in computer
        FileUtils.copyFile(sourceFile,new File("C:\\Users\\temmu\\screenshot.png"));




    }
}
