package tests;

import Suporte.CreateDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Steam.HomeSteamPO;

public class T002GlovesTest {
    private WebDriver driver;

    @Before
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
        Assert.assertEquals(false, comprarSkin);
    }


    @After
    public void tearDown(){
        //Screenshot.takeScrennshot();
        driver.close();
    }
}
