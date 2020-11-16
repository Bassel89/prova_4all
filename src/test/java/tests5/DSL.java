package tests5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DSL {
    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void escreveNoCampo(String id_campo,String texto){
        driver.findElement(By.id(id_campo)).clear();
        driver.findElement(By.id(id_campo)).sendKeys(texto);
    }
    public void selecionarSexo(String id_campo){
        driver.findElement(By.id(id_campo)).click();
    }
    public void selecionarDaLista(String id,String valor){
        new Select(driver.findElement(By.id(id))).selectByVisibleText(valor);
    }
    public void clicaBotao(String id_botao){
        driver.findElement(By.id(id_botao)).click();
    }
    public void validarTexto (String id,String text){
       Assert.assertTrue(driver.findElement(By.id(id)).getText().startsWith(text));
    }
}
