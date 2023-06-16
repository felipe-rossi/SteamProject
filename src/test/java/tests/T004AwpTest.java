package tests;

import Suporte.CreateDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Steam.HomeSteamPO;

public class T004AwpTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        CreateDriver cd = new CreateDriver();
        driver = cd.createWebdriverFirexox();

        driver.get("https://steamcommunity.com/market");
    }

    @org.testng.annotations.Test
    public void validar001PrecoDaAwpDegrade(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_awp")
                .buscarSkin("AWP | Degradê")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(25000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 10s");
        }

    }

    @org.testng.annotations.Test
    public void validar002PrecoDaAwpDescargaEletrica(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_awp")
                .buscarSkin("AWP | Descarga Elétrica")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(25000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 10s");
        }

    }

    @org.testng.annotations.Test
    public void validar003PrecoDaAwpOniTaiji(){
        boolean comprarSkin = new HomeSteamPO(driver)
                .clicarNaOpcaoMercadoComunidade()
                .escolherTipoDeProdutoQueVaiSerPesquisa("tag_weapon_awp")
                .buscarSkin("AWP | Oni Taiji")
                .ordernarPeloMenorPreco()
                .validarValorDaSkin();
        Assert.assertFalse(comprarSkin);

        try {
            Thread.sleep(25000);
        }catch (Exception e){
            System.out.println("Erro ao esperar 10s");
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        driver.close();
    }
}
