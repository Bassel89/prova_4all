package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AplicInmetricsTest {
    private WebDriver navegador;

    @Before
    public void startUP(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("https://aplic.inmetrics.com.br/");
    }
    @Test
    public void testNavegando(){
       navegador.get("https://aplic.inmetrics.com.br//requerimento/content/login.php");
       // navegador.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/a/img")).click();
      //  navegador.findElement(By.xpath("//*[@id=\"txtUsuario\"]")).clear();
        //navegador.findElement(By.xpath("//*[@id=\"txtUsuario\"]")).click();
        navegador.findElement(By.id("fun_Id")).sendKeys("23759109829");
       // navegador.findElement(By.xpath("//*[@id=\"txtSenha\"]")).clear();
        //navegador.findElement(By.xpath("//*[@id=\"txtSenha\"]")).click();
        navegador.findElement(By.id("fun_Senha")).sendKeys("Bassel88644");
        navegador.findElement(By.id("btnSubmitLogn")).click();
        navegador.findElement(By.xpath("//*[@id=\"frequencia\"]/tbody/tr[2]/td/table[2]/tbody/tr[43]/td[1]/a/img")).click();
        WebElement elemento = navegador.findElement(By.id("tipoRequerimento"));
        Select combo = new Select(elemento);
        combo.selectByVisibleText(" ALOCAÇÃO DE HORAS POR PROJETO");
        //navegador.findElement(By.className("search-field")).click();
    }
    @After
    public void tearDown(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException ie){

        }
        navegador.quit();
    }
}
