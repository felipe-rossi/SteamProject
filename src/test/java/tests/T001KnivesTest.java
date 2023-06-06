package tests;

import Suporte.CreateDriver;
import Suporte.EnviarEmail;
import Suporte.Screenshot;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Steam.BuscarNoMercadoDaComunidadePO;
import pages.Steam.HomeSteamPO;

public class T001KnivesTest {

   private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        driver.get("https://steamcommunity.com/market");

    }


    @Test
    public void validarPrecoDasFacas(){
            boolean comprarSkin = new HomeSteamPO(driver)
            .clicarNaOpcaoMercadoComunidade()
            .escolherTipoDeProdutoQueVaiSerPesquisa("tag_730_Type_CSGO_Type_Knife")
            .ordernarPeloMenorPreco()
            .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
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
