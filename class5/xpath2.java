package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        open smart bear
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx%22");

//        find the username
                WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");

//        find the pasword field
        driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("test");

//       clear the username text box using method clear()
        username.clear();

//        to get the text username which is beside the username text box

        WebElement usernameText = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());


//        get the text password which is beside the password text box
        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText = passwordText.getText();
        System.out.println(pasText);


    }}

