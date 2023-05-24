package pages;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscarNoMercadoDaComunidadePO extends BasePage {
    public BuscarNoMercadoDaComunidadePO(WebDriver driver) {
        super(driver);
    }

    public BuscarNoMercadoDaComunidadePO ordernarPeloMenorPreco(){
        WebElement ordernarpreco = driver.findElement(By.xpath("//*[@data-sorttype='price']"));
        ordernarpreco.click();

        return this;
    }
}
