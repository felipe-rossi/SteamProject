package pages;


import Suporte.BasePage;
import Suporte.CreateDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeSteamPO extends BasePage {

    public HomeSteamPO(WebDriver driver) {
        super(driver);
    }

    public MercadoComunidadePO clicarNaOpcaoMercadoComunidade(){
        WebElement menuComunidade = driver.findElement(By.linkText("COMUNIDADE"));
        new Actions(driver).moveToElement(menuComunidade).perform();

        WebElement menuMercado = driver.findElement(By.linkText("MERCADO"));
        menuMercado.click();

        return new MercadoComunidadePO(driver);
    }

    public LoginPO clicarEmIniciarSessao(){
        WebElement btnIniciarSessao = driver.findElement(By.linkText("iniciar sessão"));
        btnIniciarSessao.click();

        return new LoginPO(driver);
    }

}
