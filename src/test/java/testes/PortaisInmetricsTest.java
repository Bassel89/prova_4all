package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PortaisInmetricsTest {
    @Test
    public void testInteragirPortais() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Bassel");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        //WebElement lista = driver.findElement(By.id("elementosForm:escolaridade"));
        //Select item = new Select(lista);
        //item.selectByVisibleText("Superior");
       // Assert.assertEquals("Superior", item.getFirstSelectedOption().getText());
        driver.switchTo().frame("frame1");
        driver.findElement(By.id("frameButton")).click();
        Alert alerta = driver.switchTo().alert();
        String texto = alerta.getText();
        alerta.accept();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys(texto);
        new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("2o grau incompleto");
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
        Assert.assertEquals("Corrida", driver.findElement(By.id("elementosForm:esportes")).getAttribute("value"));
        driver.findElement(By.id("elementosForm:cadastrar")).click();
        Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));

        Thread.sleep(3000);
        driver.quit();
    }
}
