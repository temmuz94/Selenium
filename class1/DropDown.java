package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDOwn = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //Use select class because this drop down has a select tag
        Select sel= new Select(dropDOwn);
        // Using Select class we have different classes
        sel.selectByIndex(2); //Monday
        Thread.sleep(4000);
        sel.selectByValue("Tuesday");
        Thread.sleep(4000);
        // Select by visible text
        sel.selectByVisibleText("Friday");
        sel.isMultiple(); // Boolean if it is  multiple or not



    }
}
