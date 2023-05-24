package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;


public class CreateDriver {

    public static WebDriver createWebdriver(){
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-web-security");
       // option.addArguments("--user-data-dir");
        option.addArguments("--allow-running-insecure-content");

        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://store.steampowered.com");

        return driver;

    }
}
