package Pages;


import Maps.SteamMaps;
import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeSteamPO extends SteamMaps {

    public HomeSteamPO(WebDriver driver) {
        super(driver);
    }


    public MercadoComunidadePO clicarNaOpcaoMercadoComunidade(){
        new Actions(driver).moveToElement(menuComunidade).perform();
        wait.until(ExpectedConditions.visibilityOf(menuMercado));
        menuMercado.click();

        return new MercadoComunidadePO(driver);
    }


}
