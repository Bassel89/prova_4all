package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CampoTreinamentoTeste {
    @Test
    public void testeCampos(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("C:\\Users\\BASSEL\\OneDrive\\Desktop\\campo-treinamento\\componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Bassel");
        //Verificar se realmente preencheu Bassel
        Assert.assertEquals("Bassel", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
        //para escolher do comboBox
       WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
       Select combo = new Select(elemento);
       combo.selectByVisibleText("Superior");
       Assert.assertEquals("Superior", combo.getFirstSelectedOption().getText());
       WebElement elemento2 = driver.findElement(By.id("elementosForm:esportes"));
       Select combo2 = new Select(elemento2);
       combo2.selectByVisibleText("Natacao");
       combo2.selectByVisibleText("Corrida");
       //Asserção via tamanhao da lista
       List<WebElement> allSelectedOptions = combo2.getAllSelectedOptions();
       Assert.assertEquals(2, allSelectedOptions.size());
        WebElement linkText = driver.findElement(By.linkText("Voltar"));
        linkText.click();
       // Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Campo de Treinamento"));
        Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains("Campo de Treinamento"));
        Assert.assertEquals("Cuidado onde clica, muitas armadilhas...", driver.findElement(By.className("facilAchar")).getText());
        //driver.close();



    }
}