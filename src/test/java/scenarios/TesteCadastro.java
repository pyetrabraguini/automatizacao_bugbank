package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TesteCadastro {

    WebDriver driver;
    HomePage homePage;


    @Before
    public void before() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

        driver.get("http://localhost:3000");
        Thread.sleep(1000);
    }

    @Test
    public void testeCadastro(){

        homePage.clicarRegistrar();
        homePage.preencherEmail();
        homePage.preencherNome();
        homePage.preencherSenha();
        homePage.preencherConfirmacaoSenha();
        homePage.clicarCriarComSaldo();
        homePage.clicarCadastrar();


    }
    @After
    public void finaliza(){
        driver.quit();
    }
}
