package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
        // switch to the iframe which contains the input box
        // method by index
        driver.switchTo().frame(0);
        // this statement will shift the focus to the first frame
        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("ananisikem");
        //switch to parent window
        driver.switchTo().defaultContent();
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println(text.getText());
        // get the ext enter name in the frame
        driver.switchTo().frame("iframe_a");
        textBox.clear();//clears our input

        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("The label is :"+getLabel.getText());
        driver.switchTo().defaultContent();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear(); //clears our input






    }
}
