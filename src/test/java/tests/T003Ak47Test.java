package tests;

import Suporte.CreateDriver;
import Suporte.EnviarEmail;
import Suporte.Screenshot;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Steam.BuscarNoMercadoDaComunidadePO;
import pages.Steam.HomeSteamPO;

public class T003Ak47Test {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        driver.get("https://steamcommunity.com/profiles/76561199508799871/");
    }

    @org.testng.annotations.Test
    public void validar001PrecoDaAk47RaioX(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Raio-X")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }

    @org.testng.annotations.Test
    public void validarPrecoDaAk47SerpenteDeFogo(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Serpente de Fogo")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }

    @org.testng.annotations.Test
    public void validarPrecoDaAk47Hidroponica(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Hidropônica")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }

    @org.testng.annotations.Test
    public void validarPrecoDaAk47Viajante(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Viajante")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }

    @org.testng.annotations.Test
    public void validarPrecoDaAk47OncaPintada(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 (Lembrança) | Onça-pintada")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }

    @org.testng.annotations.Test
    public void validarPrecoDaAk47AquecimentoDeAco(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Aquecimento")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }

    @org.testng.annotations.Test
    public void validarPrecoDaAk47Vulcan(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Vulcan")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }

    @Test
    public void validarPrecoDaAk47BombaDeCombustivel(){
        boolean comprarSkin = new HomeSteamPO(driver)
//                .clicarEmIniciarSessao()
//                .realizarLogin("feliperossisteam","EL3+X]r+1r")
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Bomba de Combustível")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
    }


    @AfterMethod
    public void tearDown(ITestResult result){
        driver.close();
    }
}
