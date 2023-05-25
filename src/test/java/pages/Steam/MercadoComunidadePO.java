package pages.Steam;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MercadoComunidadePO extends BasePage {
    public MercadoComunidadePO(WebDriver driver) {
        super(driver);
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public BuscarNoMercadoDaComunidadePO escolherProdutoQueVaiSerPesquisado(String produto){
        WebElement btnExibirOpcoesDetalhadas = driver.findElement(By.xpath("//*[contains(text(), 'Exibir opções avançadas...')]"));
        btnExibirOpcoesDetalhadas.click();

        WebElement campoSelecionar = driver.findElement(By.id("market_advancedsearch_appselect"));
        campoSelecionar.click();

        WebElement campoSelecioneJogo = driver.findElement(By.id("market_advancedsearch_appselect_options_apps"));
        campoSelecioneJogo.findElement(By.id("app_option_730")).click();

        WebElement campoSelecioneArma = driver.findElement(By.name("category_730_Weapon[]"));
        new Select(campoSelecioneArma).selectByValue(produto);

        List <WebElement> btnBuscar = driver.findElements(By.xpath("//*[contains(text(), 'Buscar')]"));
        btnBuscar.get(2).click();

        return new BuscarNoMercadoDaComunidadePO(driver);
    }
}
