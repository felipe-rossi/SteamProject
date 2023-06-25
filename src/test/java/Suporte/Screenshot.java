package Suporte;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class Screenshot extends BasePage{

    public Screenshot(WebDriver driver) {
        super(driver);
    }

    public void tirarPrint(){
        try{
            File arquivo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(arquivo, new File("Screenshots\\ultimo_erro.png"));
        }catch (Exception e){
            System.out.println("Erro ao tirar print da tela: " + e.getMessage());
        }

    }
}
