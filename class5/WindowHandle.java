package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-335413827%3A1678243121827584&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdpJ9q5SwoMqiT4GA-Czk4mLMPo9nanm6d0EnhzpSYzQCrHPYi6e7JX21QQqT5T5unifGK7_g");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWindowHandle);

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Number of window handles: " + windowHandles.size());

        for (String windowHandle : windowHandles) {
            System.out.println(windowHandle);
            //switch the focus of the driver to help window
            driver.switchTo().window(windowHandle);
            //check the tittle of hte window which our focus is right now
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }//to verify we switched to the right window
        System.out.println(driver.getTitle());

driver.switchTo().window(parentWindowHandle);
        System.out.println(driver.getTitle());
        driver.quit();
    }
    }

