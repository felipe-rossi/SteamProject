package pages.Gmail;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageGmailPO extends BasePage {
    public LoginPageGmailPO(WebDriver driver) {
        super(driver);
    }

    public CaixaDeEntradaPO realizarLoginGmail(String email, String senha){

        WebElement campoEmail = driver.findElement(By.id("identifierId"));
        campoEmail.sendKeys(email);

        WebElement btnProxima = driver.findElement(By.id("identifierNext"));
        btnProxima.click();

        WebElement campoSenha = driver.findElement(By.name("password"));
        campoSenha.sendKeys(senha);

        WebElement btnProxima2 = driver.findElement(By.id("identifierNext"));
        btnProxima2.click();

        return new CaixaDeEntradaPO(driver);
    }
}
