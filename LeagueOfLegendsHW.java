import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeagueOfLegendsHW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://signup.leagueoflegends.com/en-us/signup/index?gclid=EAIaIQobChMI3o_8o-O7_QIVkvPICh3_3Q_9EAAYASAAEgJ1efD_BwE&gclsrc=aw.ds#/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[class=''][type='email'][name='email']")).sendKeys("temmuzgokcen@gmail.com");
        driver.findElement(By.cssSelector("#root > div > div > div.welcome-component.scene-component.mounted.campaign-lol > div.scene-content > form > div.next-button > button")).click();

    }
}
