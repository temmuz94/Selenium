import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String path="https://www.google.com/";
        driver.get(path);
        String URL=driver.getCurrentUrl();
        String title= driver.getTitle();
        System.out.println("the title of the page is: "+title);
        if(path.equalsIgnoreCase(URL)){
            System.out.println("match");
        }else {
            System.out.println("no match");
        }if(title.equalsIgnoreCase("Google")){
            System.out.println("Match");
        }else {
            System.out.println("No Match");
            Thread.sleep(2000);// delayed for 2 sec to quit method
        }driver.quit();
    }
}
