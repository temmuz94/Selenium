package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //iterate through the list
        for (int i = 0; i <checkBoxes.size() ; i++) {


        String value= checkBoxes.get(i).getAttribute("value");
        if (value.equalsIgnoreCase("Option-2")){
            checkBoxes.get(i).click();
        }
           /* for (WebElement checkBox : checkBoxes) {

                String value=checkBox.getAttribute("value");
                if(value.equalsIgnoreCase("Option-2"));
                checkBoxes.get(i).click();  */
            }

            }

    }

