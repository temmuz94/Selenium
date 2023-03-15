package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.findElements(By.tagName("a"));
       driver.findElements(By.tagName("a")).toString();

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
            driver.manage().window().maximize();
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
            driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
            driver.findElement(By.className("button")).click();
            String title= driver.getTitle();
            if(title.equalsIgnoreCase("Web Orders")){
                System.out.println("The title is correct");
            }else {
                System.out.println("Title is not wrong");
            }driver.findElement(By.linkText("Logout")).click();
            driver.quit();


                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
              //  WebDriver driver = new ChromeDriver();
                driver.get("https://www.facebook.com/");
                driver.findElement(By.id("email")).sendKeys(new CharSequence[]{"temmuz"});
                driver.findElement(By.id("pass")).sendKeys(new CharSequence[]{"musakka"});
                driver.findElement(By.linkText("Create new account")).click();
                driver.findElement(By.partialLinkText(" password?")).click();
                driver.quit();
            }
        }




