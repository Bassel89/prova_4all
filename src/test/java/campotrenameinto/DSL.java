package campotrenameinto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void clicarNoRadio(String id_radio){
        driver.findElement(By.id(id_radio)).click();
    }
    public void selecionarEscolaridade(String id,String valor){
        WebElement element = driver.findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }
    public void selcionarEsport(String id,String valor){
        WebElement elemento = driver.findElement(By.id(id));
        Select combo = new Select(elemento);
        combo.selectByVisibleText(valor);

    }
    public void cadastrar(String id_botao){
        driver.findElement(By.id(id_botao)).click();
    }
    public void clicarBotãoConfirmar(String id_botao){
        driver.findElement(By.id(id_botao)).click();
    }
    public void clicaNoBotao(String id){
        driver.findElement(By.xpath(id)).click();

    }
}
