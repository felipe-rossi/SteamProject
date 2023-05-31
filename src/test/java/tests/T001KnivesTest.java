package tests;

import Suporte.CreateDriver;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.Outlook.LoginPageOutlookPO;
import pages.Steam.HomeSteamPO;

public class T001KnivesTest {

   private WebDriver driver;

    @Before
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        driver.get("https://store.steampowered.com/?l=brazilian");

    }


    @Test
    public void validarPrecoDasFacas(){
            boolean comprarSkin = new HomeSteamPO(driver)
            .clicarEmIniciarSessao()
            .realizarLogin("feliperossisteam","EL3+X]r+1r")
            .clicarNaOpcaoMercadoComunidade()
            .escolherTipoDeProdutoQueVaiSerPesquisa("tag_730_Type_CSGO_Type_Knife")
            .ordernarPeloMenorPreco()
            .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }


    @After
    public void tearDown(){
        //Screenshot.takeScrennshot();
       //driver.close();
    }
}
