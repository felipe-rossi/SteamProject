package pages.Steam;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MercadoComunidadePO extends BasePage {
    public MercadoComunidadePO(WebDriver driver) {
        super(driver);
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public BuscarNoMercadoDaComunidadePO escolherTipoDeProdutoQueVaiSerPesquisa(String tipoSkin){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement btnExibirOpcoesDetalhadas = driver.findElement(By.xpath("//*[contains(text(), 'Exibir opções avançadas...')]"));
        btnExibirOpcoesDetalhadas.click();

        WebElement campoSelecionar = driver.findElement(By.id("market_advancedsearch_appselect"));
        campoSelecionar.click();

        WebElement campoSelecioneJogo = driver.findElement(By.id("market_advancedsearch_appselect_options_apps"));
        campoSelecioneJogo.findElement(By.id("app_option_730")).click();

        if(tipoSkin.contains("Type")){
            WebElement campoSelecioneFaca = driver.findElement(By.id(tipoSkin));
            campoSelecioneFaca.click();
        }else if(tipoSkin.contains("weapon")){
            WebElement campoSelecioneFaca = driver.findElement(By.name("category_730_Weapon[]"));
            new Select(campoSelecioneFaca).selectByValue(tipoSkin);
        }


        List <WebElement> btnBuscar = driver.findElements(By.xpath("//*[contains(text(), 'Buscar')]"));
        btnBuscar.get(2).click();

        return new BuscarNoMercadoDaComunidadePO(driver);
    }
}
