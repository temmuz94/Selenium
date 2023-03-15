package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //table based access -level1

        //gets whole table accessed
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

        //print it on the console
        String tableData= table.getText();
        // System.out.println(tableData);

        //get all the rows in the table
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        //print the rows
        for (WebElement row : Rows) {

            //extract tex from each roll
           // String rowText = row.getText();

           //roll level access level2
            //print if contains Google
            //if(rowText.contains("Google")){
              //  System.out.println(rowText);
            }
            // column level access level3
          //  List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
            //for (WebElement column : columns) {
               // System.out.println(column.getText());

        List<WebElement> firstColumns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement firstColumn : firstColumns) {
            System.out.println(firstColumn.getText());
        }


    }



        }








