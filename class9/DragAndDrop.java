package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        //get the element you want to drag
      WebElement draggable=  driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
      //get the droppable element
        WebElement droppable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        //Action class
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();

    }
}
