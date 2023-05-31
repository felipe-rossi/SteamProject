package tests;

import Suporte.CreateDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Steam.HomeSteamPO;

public class T003Ak47Test {

    private WebDriver driver;

    @Before
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        driver.get("https://store.steampowered.com/?l=brazilian");
    }

    @Test
    public void validar001PrecoDaAk47RaioX(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Raio-X")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47SerpenteDeFogo(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Serpente de Fogo")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47Hidroponica(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Hidropônica")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47Viajante(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Viajante")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47OncaPintada(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 (Lembrança) | Onça-pintada")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47AquecimentoDeAco(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Aquecimento")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47Vulcan(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Vulcan")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47BombaDeCombustivel(){
        boolean comprarSkin = new HomeSteamPO(driver)

                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Bomba de Combustível")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertEquals(false, comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47Teste(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Grade de Safári")
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
