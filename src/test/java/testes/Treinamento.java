package testes;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treinamento {
    @Test
    public void estudar(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/campo-treinamento/componentes.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Bassel");
        driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Said");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
        new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
        new  Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
        driver.findElement(By.id("alert")).click();
        Alert alerta = driver.switchTo().alert();
        String textoAlert = alerta.getText();
        alerta.accept();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("confirm")).click();
        Alert alerta2 = driver.switchTo().alert();
        alerta2.accept();
        alerta2.accept();
//        //driver.switchTo().defaultContent();
//        driver.findElement(By.id("prompt")).click();
//        Alert alerta3 = driver.switchTo().alert();
//        alerta3.sendKeys("qweqeq");
//        driver.switchTo().frame("frame1");
//        driver.findElement(By.id("frameButton")).click();
        driver.findElement(By.id("buttonPopUpEasy")).click();
        driver.switchTo().window("Popup");
        driver.findElement(By.tagName("textarea")).sendKeys("asdasdasd");
        driver.close();
        driver.switchTo().window("");


       // alerta3.accept();

        //driver.close();
    }

}
