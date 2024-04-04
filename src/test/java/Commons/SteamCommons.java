package Commons;

import Suporte.CreateDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SteamCommons extends CreateDriver {
    public SteamCommons(WebDriver driver) {
        super(driver);
    }

    public void darScrollComandoJavascript(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

}
