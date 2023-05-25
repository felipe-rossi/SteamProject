package pages.Steam;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPO extends BasePage {
    public LoginPO(WebDriver driver) {
        super(driver);
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public HomeSteamPO realizarLogin(String usuario, String senha){
       List <WebElement> campos = driver.findElements(By.xpath("//input[@class='newlogindialog_TextInput_2eKVn']"));
       campos.get(0).sendKeys(usuario);
       campos.get(1).sendKeys(senha);

        WebElement btnIniciarSessao = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        btnIniciarSessao.click();

        WebElement nomeSteam = driver.findElement(By.id("account_pulldown"));
        wait.until(ExpectedConditions.visibilityOf(nomeSteam));

        return new HomeSteamPO(driver);
    }
}