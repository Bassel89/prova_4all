package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InmetricsTest {
    @Test
    public void testPortaldoColaborador(){
        //Assert.assertEquals(1,1);
        //Localizar chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        //Abrir navegador
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //Navegador abri uma janela maximizada
        navegador.manage().window().maximize();
        //Navegar para o site
        navegador.get("https://aplic.inmetrics.com.br/");
        navegador.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/a/img")).click();
        navegador.findElement(By.xpath("//*[@id=\"txtUsuario\"]")).sendKeys("basselsa");
        navegador.findElement(By.xpath("//*[@id=\"txtSenha\"]")).sendKeys("M@trix88644");
        navegador.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

        //Fechar browser

        navegador.close();

    }
}
