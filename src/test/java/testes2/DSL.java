package testes2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DSL {
    private WebDriver driver1;

    public DSL(WebDriver driver) {
        this.driver1 = driver;
    }

    public void escreve(String id_campo, String texto){
        driver1.findElement(By.id(id_campo)).sendKeys(texto);

    }
    public void clicarRadioBottom(String id_bottom){
        driver1.findElement(By.id(id_bottom)).click();

    }
    public void selecionarCombo(String id, String valor){
        new Select(driver1.findElement(By.id(id))).selectByVisibleText(valor);

    }
}
