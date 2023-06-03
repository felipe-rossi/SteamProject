package pages.Steam;


import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeSteamPO extends BasePage {

    public HomeSteamPO(WebDriver driver) {
        super(driver);
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public MercadoComunidadePO clicarNaOpcaoMercadoComunidade(){
        WebElement menuComunidade = driver.findElement(By.linkText("COMUNIDADE"));
        new Actions(driver).moveToElement(menuComunidade).perform();

        WebElement menuMercado = driver.findElement(By.linkText("MERCADO"));
        menuMercado.click();

        return new MercadoComunidadePO(driver);
    }


//    public HomeSteamPO selecionarLinguagemPortugues(){
//        WebElement btnIdioma = driver.findElement(By.id("language_pulldown"));
//        btnIdioma.click();
//
//    }

}
