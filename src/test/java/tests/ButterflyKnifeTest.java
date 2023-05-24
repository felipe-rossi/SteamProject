package tests;

import Suporte.CreateDriver;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomeSteamPO;

public class ButterflyKnifeTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = CreateDriver.createWebdriver();

        new HomeSteamPO(driver)
        .clicarEmIniciarSessao()
        .realizarLogin("akigasttt","felipaogay12");
    }


    @Test
    public void ValidarPrecoDaFacaButterfly(){
            new HomeSteamPO(driver)
            .clicarNaOpcaoMercadoComunidade()
            .escolherProdutoQueVaiSerPesquisado()
            .ordernarPeloMenorPreco();
    }


    @After
    public void tearDown(){
        //driver.quit();
    }
}
