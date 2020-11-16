package tests4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void escreveNoCampo(String id_campo,String texto){
        driver.findElement(By.id(id_campo)).sendKeys(texto);
    }
    public void selecionaRadioBotao(String id_radio){
        driver.findElement(By.id(id_radio)).click();

    }
}
