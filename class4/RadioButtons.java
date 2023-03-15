package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //go to syntaxprojecs.com
        // to click button Male used Css

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver


//        create an instance of WebDriver

//        max the window


//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
//        click on the radio button Male
                WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
                boolean isEnableMale=maleBtn.isEnabled();
        System.out.println(isEnableMale);
        boolean isDisplayedMale =maleBtn.isDisplayed();
        System.out.println(isDisplayedMale);
        boolean isSelectedMale =maleBtn.isSelected();
        System.out.println(isSelectedMale);
        if(!isSelectedMale){


        maleBtn.click();

    }isSelectedMale=maleBtn.isSelected();
        System.out.println(isSelectedMale);
}}
