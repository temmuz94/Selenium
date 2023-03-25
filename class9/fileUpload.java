package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
       WebElement filePic= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a"));
       filePic.click();
        WebElement chooseFile =  driver.findElement(By.xpath("//input[@id='file-upload']"));



        chooseFile.sendKeys("C:\\Users\\temmu\\OneDrive\\Masaüstü\\125879879_659417644755927_405342861918078308_n.jpg");

        driver.findElement(By.xpath("//input[@value='Upload']")).click();


    }
}
