package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tablesDynamic1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        List<WebElement> column = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        for (int i = 0; i <column.size() ; i++) {
            String text = column.get(i).getText();
            if(text.equalsIgnoreCase("MyMoney")){
              //  System.out.println("money is in the list on index "+i);
                System.out.println("money is in the table on index "+(i+2));
                driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]")).click();
            }

        }
    }
}
