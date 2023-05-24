package tests;

import Suporte.CreateDriver;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Gmail.LoginPageGmailPO;
import pages.Steam.HomeSteamPO;

public class ButterflyKnifeTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = CreateDriver.createWebdriver();

        new HomeSteamPO(driver)
        .clicarEmIniciarSessao()
        .realizarLogin("akigasttt","felipaogay12");

        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1812290001%3A1684897986224972&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Af_xneG75z5ldqVcW-iXF-wLH2XgsHuXANxDL8Vq_McgeyJV4C1brWauI_-LUfbdKCThQBuY8-ht&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        new LoginPageGmailPO(driver)
        .realizarLoginGmail("saancaio@gmail.com","m@rd0sladro3s2017");
    }


    @Test
    public void ValidarPrecoDaFacaButterfly(){
//            new HomeSteamPO(driver)
//            .clicarNaOpcaoMercadoComunidade()
//            .escolherProdutoQueVaiSerPesquisado()
//            .ordernarPeloMenorPreco();
    }


    @After
    public void tearDown(){
       //driver.quit();
    }
}
