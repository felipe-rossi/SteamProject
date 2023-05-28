package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class CreateDriver {

    public WebDriver createWebdriver() {

        System.setProperty("webdriver.chrome.driver","/home/frossi/Documentos/geckodriver");

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("intl.accept_languages", "pt-BR");

        FirefoxOptions firefoxOptions = new FirefoxOptions();

        firefoxOptions.setProfile(profile);

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://store.steampowered.com/?l=brazilian");

        return driver;

    }
}
