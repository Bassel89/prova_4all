package tests4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtacadaoTest {
    private WebDriver driver;
    private DSL dsl;

    @Before
    public void testAutomacao(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
        dsl = new DSL(driver);
    }
    @Test
    public void testQueIntergirComPagina(){
        dsl.escreveNoCampo("elementosForm:nome","BASSEL");
        dsl.escreveNoCampo("elementosForm:sobrenome","SAID");
        dsl.selecionaRadioBotao("elementosForm:sexo:0");
    }
    @After
    public void finalizandoTest(){
        //driver.close();

    }

}
