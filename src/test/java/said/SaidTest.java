package said;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SaidTest {
    private WebDriver driver;
    private DSL dsl;
    private SaidTestPage page;
    @Before
    public void preparandoAmbiente(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        dsl = new DSL(driver);
        page = new SaidTestPage(driver);
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
        driver.manage().window().maximize();
    }
    @Test
    public void testandoComponentes(){
        //dsl.preencherCampo("elementosForm:nome","BASSEL");
        page.setNome("BASSEL");
        page.setSobrenome("SAID");
        page.setSexoMasculino();
        //page.setSexoMasculino("elementosForm:sexo:0");
        page.setComidaCarne();
       // page.setComidaCarne("elementosForm:comidaFavorita:0");
        page.setComidaFrango();
        page.setEcolaridadeSuperior();
        page.setEsporte();
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
        page.setTexto("Qualquer texto");

    }
    @After
    public void finalizandoTeste(){

    }
}
