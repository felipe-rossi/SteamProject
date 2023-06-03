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

        driver.get("https://steamcommunity.com/market");
    }

    @org.testng.annotations.Test
    public void validar001PrecoDaAk47RaioX(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Raio-X")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
        }
    }

    @org.testng.annotations.Test
    public void validar002PrecoDaAk47SerpenteDeFogo(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Serpente de Fogo")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
        }
    }

    @org.testng.annotations.Test
    public void validar003PrecoDaAk47Hidroponica(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Hidropônica")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
        }
    }

    @org.testng.annotations.Test
    public void validar004PrecoDaAk47Viajante(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Viajante")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
        }
    }

    @org.testng.annotations.Test
    public void validar005PrecoDaAk47OncaPintada(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 (Lembrança) | Onça-pintada")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
        }
    }

    @org.testng.annotations.Test
    public void validar006PrecoDaAk47AquecimentoDeAco(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Aquecimento")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
        }
    }

    @org.testng.annotations.Test
    public void validar007PrecoDaAk47Vulcan(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Vulcan")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);
        try {
            Thread.sleep(35000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 30s");
        }
    }

    @Test
    public void validar008PrecoDaAk47BombaDeCombustivel(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_ak47")
                .buscarSkin("AK-47 | Bomba de Combustível")
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
        driver.close();
    }
}
