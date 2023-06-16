package tests;

import Suporte.CreateDriver;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Steam.HomeSteamPO;

public class T001KnivesTest {

   private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriverGoogleChrome();

        driver.get("https://steamcommunity.com/market");

    }


    @Test
    public void validarPrecoDasFacas(){
            boolean comprarSkin = new HomeSteamPO(driver)
            .clicarNaOpcaoMercadoComunidade()
            .escolherTipoDeProdutoQueVaiSerPesquisa("tag_730_Type_CSGO_Type_Knife") //tag_weapon_ak47
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

//        if (result.getStatus() == ITestResult.FAILURE){
//            Screenshot.takeScrennshot("C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Steam Project - Knives\\target\\Screenshots\\Facas");
//        }

       driver.close();
    }
}
