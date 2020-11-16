package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class TestAplicInmetrics {
    @Test
    public void testNavegando(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://aplic.inmetrics.com.br/");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/a/img")).click();
        List<String> abas = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(abas.get(1));
        driver.findElement(By.id("txtUsuario")).sendKeys("basselsa");
        driver.findElement(By.id("txtSenha")).sendKeys("M@trix88644");
        driver.findElement(By.id("btnLogin")).click();
        Assert.assertEquals("BASSEL SAID", driver.findElement(By.id("lblUserName")).getText());
        driver.switchTo().window(abas.get(0));
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[9]/div/a/img")).click();
       // abas = new ArrayList<String>(driver.getWindowHandles());
      //  driver.switchTo().window(abas.get(1));
        driver.findElement(By.id("fun_Id")).sendKeys("23759109829");
       // driver.findElement(By.id("fun_Senha")).sendKeys("Bassel88644");


        //driver.quit();
        //driver.close();

    }
}
