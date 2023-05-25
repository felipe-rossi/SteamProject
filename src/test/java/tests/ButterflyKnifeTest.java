package tests;

import Suporte.CreateDriver;
import Suporte.Screenshot;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Steam.HomeSteamPO;

public class ButterflyKnifeTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = CreateDriver.createWebdriver();

        /*driver.get("https://login.live.com/");
        new LoginPageOutlookPO(driver)
        .realizarLoginOutlook("felipe.rossisteam@hotmail.com","FQ}$0obAP5");*/
    }


    @Test
    public void ValidarPrecoDaFacaButterfly(){
            new HomeSteamPO(driver)
            .clicarEmIniciarSessao()
            .realizarLogin("feliperossisteam","EL3+X]r+1r")
            .clicarNaOpcaoMercadoComunidade()
            .escolherProdutoQueVaiSerPesquisado()
            .ordernarPeloMenorPreco()
            .validarValorDaSkin();
    }


    @After
    public void tearDown(){
        Screenshot.takeScrennshot();
       driver.quit();
    }
}
