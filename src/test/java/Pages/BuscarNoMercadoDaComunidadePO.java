package Pages;

import Maps.SteamMaps;
import Suporte.BasePage;
import Suporte.EnviarEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BuscarNoMercadoDaComunidadePO extends SteamMaps {
    public BuscarNoMercadoDaComunidadePO(WebDriver driver) {
        super(driver);
    }

    public boolean comprarSkin;

    public static String nomeItem;
    public static String valorItem;
    public static String linkItem;
    public static int valorItemTratado;


    public BuscarNoMercadoDaComunidadePO ordernarPeloMenorPreco(){

       String nomePrimeiraSkin = listaNomesSkinSemFiltro.getText();

        wait.until(ExpectedConditions.visibilityOf(ordernarpreco));
        ordernarpreco.click();

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.invisibilityOfElementWithText(By.id("result_0_name"),nomePrimeiraSkin)));

        return this;
    }

    public BuscarNoMercadoDaComunidadePO buscarSkin(String nomeSkin){

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
        System.out.println("Nome da Skin: " + nomeSkinMaisBarata.getText());
        System.out.println("Link da imagem da Skin: " + listaImagens.get(0).getAttribute("src"));

        valorItem = listaPrecos.get(0).getText();
        System.out.println("Skin mais barata custa: " + listaPrecos.get(0).getText());

        linkItem = listaLinks.get(0).getAttribute("href");
        System.out.println("Link para comprar: " + listaLinks.get(0).getAttribute("href"));

        valorItemTratado = tratarValorSkin(listaPrecos.get(0).getText());

        if (tratarValorSkin(listaPrecos.get(0).getText()) <= 3000){
            System.out.println("Valor da Skin é MENOR OU IGUAL que 30 dolares (150 reais)");

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
