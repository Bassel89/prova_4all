package tests5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomacaoTest {
    private WebDriver driver;
    private DSL dsl;
    private AutomacaoTestPage page;

    @Before
    public void abrindoNavegador(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        dsl = new DSL(driver);
        page = new AutomacaoTestPage(driver);
        driver.manage().window().maximize();
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
    }
    @Test
    public void interagindoComComponentes(){
        page.setNome("BASSEL");
        //dsl.escreveNoCampo("elementosForm:nome","BASSEL");
        dsl.escreveNoCampo("elementosForm:sobrenome","SAID");
        dsl.selecionarSexo("elementosForm:sexo:0");
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
        dsl.selecionarDaLista("elementosForm:escolaridade","Superior");
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Futebol");
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Karate");
        dsl.escreveNoCampo("elementosForm:sugestoes","Qualquer texto");
        dsl.clicaBotao("elementosForm:cadastrar");
        dsl.validarTexto("resultado","Cadastrado!");
        dsl.clicaBotao("alert");
        Alert alert = driver.switchTo().alert();
        String textoAlerta = alert.getText();
        alert.accept();
        driver.switchTo().defaultContent();
        dsl.escreveNoCampo("elementosForm:sugestoes",textoAlerta);
        driver.switchTo().frame("frame1");
        dsl.clicaBotao("frameButton");
        driver.switchTo().alert();
        alert.accept();
        driver.switchTo().defaultContent();
        dsl.clicaBotao("buttonPopUpEasy");
        driver.switchTo().window("Popup");
        driver.findElement(By.tagName("textarea")).sendKeys("ksksksksksksk");
        driver.quit();
    }
    @After
    public void finalizandoTest(){
        //driver.close();

    }


}
