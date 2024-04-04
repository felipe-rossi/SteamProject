package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage{

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
}
