package tests;

import Suporte.CreateDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Steam.HomeSteamPO;

public class T005M4A4STest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriver();

        driver.get("https://steamcommunity.com/market");
    }

    @org.testng.annotations.Test
    public void validar001PrecoDaM4A4SArmaEsportiva(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_m4a1_silencer")
                .buscarSkin("M4A1-S | Arma Esportiva")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 5s");
        }

    }

    @org.testng.annotations.Test
    public void validar002PrecoDaM4A4SPerigoIminente(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_m4a1_silencer")
                .buscarSkin("M4A1-S | Perigo Iminente")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 5s");
        }

    }

    @org.testng.annotations.Test
    public void validar003PrecoDaM4A4SBemVindoASelva(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_m4a1_silencer")
                .buscarSkin("M4A1-S | Bem-vindo à Selva")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 5s");
        }

    }

    @org.testng.annotations.Test
    public void validar004PrecoDaM4A4SFosforoAzul(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_m4a1_silencer")
                .buscarSkin("M4A1-S | Fósforo Azul")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 5s");
        }

    }

    @org.testng.annotations.Test
    public void validar005PrecoDaM4A4SQuedaDeIcaro(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_m4a1_silencer")
                .buscarSkin("M4A1-S | Queda de Ícaro")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(30000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 5s");
        }
    }



    @AfterMethod
    public void tearDown(ITestResult result){
        driver.close();
    }
}
