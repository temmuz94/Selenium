package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button")).click();
        //wait for the implement the explicit and then get the text. Because the page is dynamic
        WebDriverWait wait=new WebDriverWait(driver,20);
        //once the element visible gets the text
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        WebElement text=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText= text.getText();
        System.out.println(WelcomeText);
    }
}
