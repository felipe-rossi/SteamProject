package pages.Gmail;

import Suporte.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageOutlookPO extends BasePage {
    public LoginPageOutlookPO(WebDriver driver) {
        super(driver);
    }

    public CaixaDeEntradaPO realizarLoginOutlook(String email, String senha){

        WebElement campoEmail = driver.findElement(By.xpath("//input[@type='email']"));
        campoEmail.sendKeys(email);

        WebElement btnProximo = driver.findElement(By.xpath("//input[@value='Próximo']"));
        btnProximo.click();

        WebElement campoSenha = driver.findElement(By.xpath("//input[@type='password']"));
        campoSenha.sendKeys(senha);

        WebElement btnEntrar = driver.findElement(By.xpath("//input[@data-report-event='Signin_Submit']"));
        btnEntrar.click();

        return new CaixaDeEntradaPO(driver);
    }
}
