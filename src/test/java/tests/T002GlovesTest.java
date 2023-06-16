package tests;

import Suporte.CreateDriver;
import org.junit.Assert;
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
        driver = cd.createWebdriverGoogleChrome();

        driver.get("https://steamcommunity.com/market");
    }


    @Test
    public void validarPrecoDasLuvas(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_730_Type_Type_Hands")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 10s");
        }

    }


    @AfterMethod
    public void tearDown(ITestResult result){
        driver.close();
    }
}
