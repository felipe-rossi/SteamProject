package Suporte;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;


public class CreateDriver {

    public WebDriver createWebdriver() {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("lang=pt-BR");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--user-data-dir=C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\User Data");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;

    }


    public static void salvarCookies(WebDriver driver, String arquivo) {
        Set<Cookie> cookies = driver.manage().getCookies();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Cookie cookie : cookies) {
                writer.write(cookie.getName() + "=" + cookie.getValue() +
                        "; domain=" + cookie.getDomain() +
                        "; path=" + cookie.getPath());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void carregarCookies(WebDriver driver, String arquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");

                String nome = null;
                String valor = null;
                String domain = null;
                String path = null;

                for (String parte : partes) {
                    String[] chaveValor = parte.trim().split("=");
                    String chave = chaveValor[0].trim();
                    String valorCookie = chaveValor[1].trim();

                    switch (chave) {
                        case "name":
                            nome = valorCookie;
                            break;
                        case "value":
                            valor = valorCookie;
                            break;
                        case "domain":
                            domain = valorCookie;
                            break;
                        case "path":
                            path = valorCookie;
                            break;
                    }
                }

                if (nome != null && valor != null && domain != null && path != null) {
                    Cookie cookie = new Cookie(nome, valor,domain);
                    driver.manage().addCookie(cookie);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
