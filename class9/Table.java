package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //different tables are built differently
//   goto syntax HRMS application and login and goto the pim option

        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
                //fill out username
                driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

//        ------------------------

//        get the employee id 52396A and click on the checkbox associated with it


//in order to find the desired id
        //in order to find the desired id
        boolean idfound=false;
        while(!idfound) {
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();

                if (id.equalsIgnoreCase("52081A")) {

                    System.out.println("id is on the row " + i);
//                to click on the particular checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idfound=true;
                    break;
                }
            }
//        click on the next page
            if(!idfound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
              //  WebElement fun=(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[5]/td[6]"));


            }/*We have used a while loop that will continue running until the id is found. The idfound variable is initially set to false.
             Inside the loop, we find all the ids in the table and iterate through them using a for loop.
              If we find the desired id, we print a message indicating which row it is on, click on the checkbox associated with it,
               and set idfound to true so that we exit the loop. If the desired id is not found on the current page, we click on the "Next" button to go to the next page and continue searching.
            If the desired id is not found on any of the pages, the loop will continue running indefinitely.
             Therefore, it is important to add some additional conditions to ensure that the loop will eventually terminate,
              such as a maximum number of pages to search or a timeout.*/
        }


    }
}