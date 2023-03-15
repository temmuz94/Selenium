package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

       driver.findElement(By.xpath("//input[@id='monday']")).isSelected();
        System.out.println(driver.findElement(By.xpath("//input[@id='monday']")).isSelected());//false
      /*  driver.findElement(By.xpath("//input[@id='monday']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='monday']")).isSelected());//true
        driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));//contains method
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }driver.quit();*/

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.getAttribute("id").equalsIgnoreCase("tuesday") || checkbox.getAttribute("id").equalsIgnoreCase("thursday") || checkbox.getAttribute("id").equalsIgnoreCase("monday")){
                ;
        checkbox.click();
              /*  for (int i = 5; i < checkboxes.size() ; i++) {//clicks last two checkboxes
                    checkboxes.get(i).click();*/

                }
        }driver.close();




        }


    }

