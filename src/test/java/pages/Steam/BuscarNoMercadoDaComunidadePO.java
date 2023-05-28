package pages.Steam;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BuscarNoMercadoDaComunidadePO extends BasePage {
    public BuscarNoMercadoDaComunidadePO(WebDriver driver) {
        super(driver);
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    public boolean comprarSkin;

    public BuscarNoMercadoDaComunidadePO ordernarPeloMenorPreco(){
        WebElement ordernarpreco = driver.findElement(By.xpath("//*[@data-sorttype='price']"));
        ordernarpreco.click();

        return this;
    }

    public boolean validarValorDaSkin(){
        comprarSkin = false;
        wait.until(ExpectedConditions.textToBe(By.xpath("//span[@class='market_sort_arrow']"),"▲"));

        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 3s");
        }

        List<WebElement> listaPrecos = driver.findElements(By.xpath("//span[@class='normal_price']"));
        System.out.println("Skin mais barata custa: " + listaPrecos.get(0).getText());

        if (tratarValorSkin(listaPrecos.get(0).getText()) <= 300){
            System.out.println("Valor da Skin é MENOR OU IGUAL que 300 reais");
            comprarSkin = true;
        }else{
            System.out.println("Valor da Skin é MAIOR que 300 reais");
            comprarSkin = false;
        }

        return comprarSkin;
    }


    public int tratarValorSkin(String preco){

        preco = preco.replace(" ", "");
        preco = preco.replace("R$", "");
        preco = preco.replace(",", "");
        preco = preco.replace(".", "");

        int valor = Integer.parseInt(preco);

        return valor;
    }
}
