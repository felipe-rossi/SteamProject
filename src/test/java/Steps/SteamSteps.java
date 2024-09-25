package Steps;

import Commons.SteamCommons;
import Maps.SteamMaps;
import Pages.BuscarNoMercadoDaComunidadePO;
import Pages.MercadoComunidadePO;
import Suporte.EnviarEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SteamSteps extends SteamMaps {
    public SteamSteps(WebDriver driver) {
        super(driver);
    }

    public SteamSteps clicarNaOpcaoMercadoComunidade(){
        new Actions(driver).moveToElement(menuComunidade).perform();
        wait.until(ExpectedConditions.visibilityOf(menuMercado));
        menuMercado.click();

        return this;
    }

    public SteamSteps escolherTipoDeProdutoQueVaiSerPesquisa(String tipoSkin){
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

        return this;
    }

    public boolean comprarSkin;

    public static String nomeItem;
    public static String valorItem;
    public static String linkItem;
    public static int valorItemTratado;


    public SteamSteps ordernarPeloMenorPreco(){

        String nomePrimeiraSkin = listaNomesSkinSemFiltro.getText();

        wait.until(ExpectedConditions.visibilityOf(ordernarpreco));
        ordernarpreco.click();

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOfElementWithText(By.id("result_0_name"),nomePrimeiraSkin)));

        return this;
    }

    public SteamSteps buscarSkin(String nomeSkin){

        wait.until(ExpectedConditions.visibilityOf(campoPesquisa));
        campoPesquisa.sendKeys(nomeSkin);
        campoPesquisa.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 2s");
        }

        return this;
    }

    public boolean validarValorDaSkin(){
        comprarSkin = false;

        nomeItem = nomeSkinMaisBarata.getText();

        valorItem = listaPrecos.get(0).getText();

        linkItem = listaLinks.get(0).getAttribute("href");

        valorItemTratado = tratarValorSkin(listaPrecos.get(0).getText());

        if (tratarValorSkin(listaPrecos.get(0).getText()) <= 3000){
            System.out.println("Valor da Skin é MENOR OU IGUAL que 30 dolares (150 reais)");

            System.out.println("Nome da Skin: " + nomeSkinMaisBarata.getText());
            System.out.println("Link da imagem da Skin: " + listaImagens.get(0).getAttribute("src"));

            System.out.println("Skin mais barata custa: " + listaPrecos.get(0).getText());

            System.out.println("Link para comprar: " + listaLinks.get(0).getAttribute("href"));

            EnviarEmail.enviarEmail(nomeItem,valorItem,linkItem);

            comprarSkin = true;

        }else{
            System.out.println("Valor da Skin é MAIOR que 30 dolares (150 reais)");
            comprarSkin = false;
        }

        return comprarSkin;
    }


    public int tratarValorSkin(String preco){

        preco = preco.replace(" ", "");
        preco = preco.replace("$", "");
        preco = preco.replace("USD", "");
        preco = preco.replace(",", "");
        preco = preco.replace(".", "");

        int valor = Integer.parseInt(preco);

        return valor;
    }

}
