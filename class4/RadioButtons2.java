package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radioButton : radioButtons) {
            String age =radioButton.getAttribute("value");
            System.out.println(age);
            if (age.equals("0 - 5")){
                radioButton.click();


        }
    }
}}
