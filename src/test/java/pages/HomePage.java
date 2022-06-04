package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    String btnRegristar = "//*[contains(text(),'Registrar')]";
    String email = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]";
    String nome = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]";
    String senha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";
    String confirmarSenha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]";
    String criarSaldo = "//label[@id='toggleAddBalance']";

    String cadastrar = "//button[contains(text(),'Cadastrar')]";

    public HomePage(WebDriver driverDoTeste) {
        this.driver = driverDoTeste;
    }

    public void clicarRegistrar() {
        driver.findElement(By.xpath(btnRegristar)).click();
    }

    public void preencherEmail() {
        driver.findElement(By.xpath(email)).sendKeys("email@teste.com");
    }

    public void preencherNome() {
        driver.findElement(By.xpath(nome)).sendKeys("Pyetra Braguini");
    }

    public void preencherSenha() {
        driver.findElement(By.xpath(senha)).sendKeys("senha123");
    }

    public void preencherConfirmacaoSenha() {
        driver.findElement(By.xpath(confirmarSenha)).sendKeys("senha123");
    }

    public void clicarCriarComSaldo() {
        driver.findElement(By.xpath(criarSaldo)).click();
    }

    public void clicarCadastrar() {
        driver.findElement(By.xpath(cadastrar)).click();
    }

}
