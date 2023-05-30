package tests;

import Suporte.CreateDriver;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.Steam.HomeSteamPO;

public class T001KnivesTest {

   private WebDriver driver;

    @Before
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        /*driver.get("https://login.live.com/");
        new LoginPageOutlookPO(driver)
        .realizarLoginOutlook("felipe.rossisteam@hotmail.com","FQ}$0obAP5");*/
    }


    @Test
    public void validarPrecoDasFacas(){
            boolean comprarSkin = new HomeSteamPO(driver)
            .clicarNaOpcaoMercadoComunidade()
            .escolherTipoDeProdutoQueVaiSerPesquisa("tag_730_Type_CSGO_Type_Knife")
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
