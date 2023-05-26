package tests;

import Suporte.CreateDriver;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.Steam.HomeSteamPO;

import java.net.MalformedURLException;

public class knivesTest {

   private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        /*driver.get("https://login.live.com/");
        new LoginPageOutlookPO(driver)
        .realizarLoginOutlook("felipe.rossisteam@hotmail.com","FQ}$0obAP5");*/
    }


    @Test
    public void validarPrecoDaFacaButterfly(){
            boolean comprarSkin = new HomeSteamPO(driver)
            .clicarEmIniciarSessao()
            .realizarLogin("feliperossisteam","EL3+X]r+1r")
            .clicarNaOpcaoMercadoComunidade()
            .escolherProdutoQueVaiSerPesquisado("tag_weapon_knife_butterfly")
            .ordernarPeloMenorPreco()
            .validarValorDaSkin();
        Assert.assertEquals(true, comprarSkin);
    }


    @Test
    public void validarPrecoDaFacaKarambit(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarEmIniciarSessao()
                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherProdutoQueVaiSerPesquisado("tag_weapon_knife_karambit")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaFacaBaioneta(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarEmIniciarSessao()
                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherProdutoQueVaiSerPesquisado("tag_weapon_bayonet")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaFacaBaionetaM9(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarEmIniciarSessao()
                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherProdutoQueVaiSerPesquisado("tag_weapon_knife_m9_bayonet")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaFacaBowie(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarEmIniciarSessao()
                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherProdutoQueVaiSerPesquisado("tag_weapon_knife_survival_bowie")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaFacaGut(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarEmIniciarSessao()
                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherProdutoQueVaiSerPesquisado("tag_weapon_knife_gut")
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