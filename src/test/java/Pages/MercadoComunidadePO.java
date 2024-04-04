package Pages;

import Commons.SteamCommons;
import Maps.SteamMaps;
import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MercadoComunidadePO extends SteamMaps {
    public MercadoComunidadePO(WebDriver driver) {
        super(driver);
    }


    public BuscarNoMercadoDaComunidadePO escolherTipoDeProdutoQueVaiSerPesquisa(String tipoSkin){
        new SteamCommons(driver).darScrollComandoJavascript();

        wait.until(ExpectedConditions.visibilityOf(btnExibirOpcoesDetalhadas));
        btnExibirOpcoesDetalhadas.click();

        wait.until(ExpectedConditions.visibilityOf(campoSelecionar));
        campoSelecionar.click();

        wait.until(ExpectedConditions.visibilityOf(campoSelecioneJogo));
        campoSelecioneJogo.findElement(By.id("app_option_730")).click();

        new Select(campoSelecioneFaca).selectByValue(tipoSkin);
        wait.until(ExpectedConditions.visibilityOf(campoSelecioneFaca));
        campoSelecioneFaca.click();

        wait.until(ExpectedConditions.visibilityOf(btnBuscar.get(2)));
        btnBuscar.get(2).click();

        return new BuscarNoMercadoDaComunidadePO(driver);
    }
}
