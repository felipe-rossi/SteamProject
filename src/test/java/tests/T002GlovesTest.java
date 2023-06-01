package tests;

import Suporte.CreateDriver;
import Suporte.Screenshot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Steam.HomeSteamPO;

public class T002GlovesTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        driver.get("https://store.steampowered.com/?l=brazilian");
    }


    @Test
    public void validarPrecoDasLuvas(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarEmIniciarSessao()
                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_730_Type_Type_Hands")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }


    @AfterMethod
    public void tearDown(ITestResult result){
        if (result.getStatus() == ITestResult.FAILURE){
            Screenshot.takeScrennshot("Luvas");
        }
        driver.close();
    }
}
