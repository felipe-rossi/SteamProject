package tests;

import Suporte.CreateDriver;
import Suporte.Screenshot;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Steam.HomeSteamPO;

public class T001KnivesTest {

   private WebDriver driver;
    Screenshot screenshot;

    @BeforeMethod
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriverGoogleChrome();
        driver.get("https://steamcommunity.com/market");
        screenshot = new Screenshot(driver);

    }


    @Test
    public void validarPrecoDasFacas(){
            boolean comprarSkin = new HomeSteamPO(driver)
            .clicarNaOpcaoMercadoComunidade()
            .escolherTipoDeProdutoQueVaiSerPesquisa("tag_730_Type_CSGO_Type_Knife") //tag_weapon_ak47 tag_730_Type_CSGO_Type_Knife
            .ordernarPeloMenorPreco()
            .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 5s");
        }

    }


    @AfterMethod
    public void tearDown(ITestResult result){

        if (result.getStatus() == ITestResult.FAILURE){
            System.out.println("Deu erro");
           screenshot.tirarPrint();
        }

       driver.close();
    }
}
