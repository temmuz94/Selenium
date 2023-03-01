import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;




public class xpath {
    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//        create an instance of WebDrive
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto amazon.com

        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381892435664&hvpos=&hvnetw=g&hvrand=18318646980507154985&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9003597&hvtargid=kwd-141123110&ref=pd_sl_63n38zzue3_e&hydadcr=28883_11845442&gclid=EAIaIQobChMI5fLr_sK7_QIVEuLICh230wc6EAAYASAAEgJ4f_D_BwE");

//        get all the links
//        we know that all links are in tag <a> which is also called anchor tag
//        lets use the locator By tagName for this purpose

                java.util.List<WebElement> tags = driver.findElements(By.tagName("a"));
//        in order to print
//         we need to iterator
        for(WebElement tag:tags){
            String link = tag.getAttribute("href");
            System.out.println(link);
        }

    }
}