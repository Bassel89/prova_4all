package said;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DSL {
    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo(String id_campo,String texto){
        driver.findElement(By.id(id_campo)).sendKeys(texto);
    }
    public void selecionar(String id){
        driver.findElement(By.id(id)).click();
    }
    public void selecionarCombo(String id,String valor){
        new Select(driver.findElement(By.id(id))).selectByVisibleText(valor);
    }
    public void escreveNoTextArea(String id_text,String valor){
        driver.findElement(By.id(id_text)).sendKeys(valor);
    }




}
