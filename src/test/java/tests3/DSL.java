package tests3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }
    public void escreve(String id_campo,String texto){
        driver.findElement(By.id(id_campo)).clear();
        driver.findElement(By.id(id_campo)).sendKeys(texto);
    }
    public void click(String id_radio){
        driver.findElement(By.id(id_radio)).click();
    }

}