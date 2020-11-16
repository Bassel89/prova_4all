package campotrenameinto;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING) para executar os cenário em ordem
public class TestAutomatizado {
    private WebDriver driver;
    private DSL dsl;
    private TestAutomatizadoPage page;
    @Before
    public void abrindoNavegador(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        dsl = new DSL(driver);
        page = new TestAutomatizadoPage(driver);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
        driver.manage().window().maximize();
    }
    @Test
    public void interagindoComComponentes() throws InterruptedException {
        //driver.findElement(By.id("elementosForm:nome")).sendKeys("BASSEL");
        //dsl.escreveNoCampo("elementosForm:nome","BASSEL");
        page.setNome("BASSEL");
        Thread.sleep(1000);
        //driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("SAID");
        //dsl.escreveNoCampo("elementosForm:sobrenome","SAID");
        page.setSobrenome("SAID");
        Thread.sleep(1000);
        //driver.findElement(By.id("elementosForm:sexo:0")).click();
        //dsl.clicarNoRadio("elementosForm:sexo:0");
        page.setSexoMasculino();
        Thread.sleep(1000);
        //driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        //dsl.clicarNoRadio("elementosForm:comidaFavorita:0");
        page.setComidaCarne();
        //Thread.sleep(1000);
        //driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        //dsl.clicarNoRadio("elementosForm:comidaFavorita:2");
        page.setComidaPizza();
        Thread.sleep(1000);
        //new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
        //dsl.selecionarEscolaridade("elementosForm:escolaridade","Superior");
        page.setEscolaridade("Superior");
        Thread.sleep(1000);
        //new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
        //dsl.selcionarEsport("elementosForm:esportes","Corrida");
        page.setEsport("Corrida","Futebol");
        Thread.sleep(1000);
        //new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Futebol");
        //driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Qualquer texto");
        dsl.escreveNoCampo("elementosForm:sugestoes","Qualquer texto!");
        Thread.sleep(2000);
        //dsl.clicarBotãoConfirmar("confirm");
        page.clicaNoBotaoConfirmar();
        //Thread.sleep(1000);
        Alert alerta = driver.switchTo().alert();
        String textoAlert = alerta.getText();
        alerta.accept();
        alerta.accept();
        driver.switchTo().defaultContent();
        dsl.escreveNoCampo("elementosForm:sugestoes",textoAlert);
        Thread.sleep(2000);
        //driver.findElement(By.id("elementosForm:cadastrar")).click();
        //dsl.cadastrar("elementosForm:cadastrar");
        page.cadastrar();
        Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
        //WebDriverWait wait = new WebDriverWait(driver,4);
        driver.findElement(By.id("buttonDelay")).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait espera = new WebDriverWait(driver,20);
        espera.until(ExpectedConditions.presenceOfElementLocated(By.id("novoCampo")));
        dsl.escreveNoCampo("novoCampo","Outro texto");

    }
    @After
    public void finalizandoTest() throws InterruptedException {
        //Thread.sleep(1000);
      // driver.quit();
    }
}
