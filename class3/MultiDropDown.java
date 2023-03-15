package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDowns = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(dropDowns);
        sel.selectByIndex(2);
        sel.selectByVisibleText("Ohio");
        // We can also deselect
        Thread.sleep(3000);
        sel.deselectByValue("Ohio");


    }
}
