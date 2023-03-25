package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // Navigate to the file upload page
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");

        // Find the file input field and send the file path to it
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[1]"));
        fileInput.sendKeys("C:/Users/temmu/OneDrive/Masaüstü/125879879_659417644755927_405342861918078308_n.jpg");


        // Submit the form to upload the file
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/div/button[1]"));
        submitButton.click();
        WebElement submitButton1 = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/table/tbody/tr/td[5]/button[1]"));
        submitButton1.click();
        driver.quit();
    }
}