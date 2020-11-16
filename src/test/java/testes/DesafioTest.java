package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesafioTest {
    @Test
    public void testDesafioCampoTreinamento() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Bassel");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Said");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
        new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Natacao");
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
        driver.findElement(By.id("elementosForm:cadastrar")).click();
        Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
        Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Bassel"));
        //Mudar o foco do driver para o frame
        driver.switchTo().frame("frame1");
        driver.findElement(By.id("frameButton")).click();
        //Mudar o foco do driver para alert
        Alert alert= driver.switchTo().alert();
        String texto = alert.getText();
        alert.accept();
        // Tem que trazer o foco do driver de volta para a pagina principal
        driver.switchTo().defaultContent();
        driver.findElement(By.id("elementosForm:sobrenome")).clear();
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys(texto);

        Thread.sleep(3000);

        driver.close();


    }
}
