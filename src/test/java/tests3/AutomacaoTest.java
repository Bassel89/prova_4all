package tests3;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomacaoTest {
    private WebDriver driver;
    private DSL dsl;
    @Test
    public void testAutomacaoJava(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        dsl = new DSL(driver);
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
        dsl.escreve("elementosForm:nome","BASSEL");
        dsl.escreve("elementosForm:sobrenome","SAID");
        dsl.click("elementosForm:sexo:0");
        dsl.click("elementosForm:comidaFavorita:0");
        new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
        new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Futebol");
        driver.findElement(By.id("alert")).click();
        Alert alert = driver.switchTo().alert();
        String textoAlert = alert.getText();
        alert.accept();
        driver.switchTo().defaultContent();


    }
}
