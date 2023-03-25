package class9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327651&hvpos=&hvnetw=g&hvrand=17324086383196400727&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9003601&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845442&gclid=EAIaIQobChMI0cX264_m_QIVu8mUCR2VRQktEAAYASAAEgLik_D_BwE");

        WebElement hoverEN =driver.findElement(By.xpath("//div[text()='EN']"));

        Actions action = new Actions(driver);

        action.moveToElement(hoverEN).perform();
    }
}
