package Maps;

import Suporte.BasePage;
import Suporte.CreateDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SteamMaps extends CreateDriver {

    public SteamMaps(WebDriver driver){
        super(driver);
    }

    @FindBy(linkText = "COMUNIDADE")
    protected WebElement menuComunidade;

    @FindBy(linkText = "Mercado")
    protected WebElement menuMercado;

    @FindBy(xpath = "//*[contains(text(), 'Exibir opções avançadas...')]")
    protected WebElement btnExibirOpcoesDetalhadas;

    @FindBy(id = "market_advancedsearch_appselect")
    protected WebElement campoSelecionar;

    @FindBy(id = "market_advancedsearch_appselect_options_apps")
    protected WebElement campoSelecioneJogo;

    @FindBy(xpath = "//select[@name='category_730_Type[]']")
    protected WebElement campoSelecioneFaca;

    @FindBy(xpath = "//*[contains(text(), 'Buscar')]")
    protected List<WebElement> btnBuscar;

    @FindBy(id = "result_0_name")
    protected WebElement listaNomesSkinSemFiltro;

    @FindBy(xpath = "//*[@data-sorttype='price']")
    protected WebElement ordernarpreco;

    @FindBy(id = "findItemsSearchBox")
    protected WebElement campoPesquisa;

    @FindBy(id = "result_0_name")
    protected WebElement nomeSkinMaisBarata;

    @FindBy(xpath = "//img[@class = 'market_listing_item_img']")
    protected List<WebElement> listaImagens;

    @FindBy(xpath = "//span[@class='normal_price']")
    protected List<WebElement> listaPrecos;

    @FindBy(xpath = "//a[@class='market_listing_row_link']")
    protected List<WebElement> listaLinks;
}
