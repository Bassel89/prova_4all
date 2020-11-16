package tests5;

import org.openqa.selenium.WebDriver;

public class AutomacaoTestPage {
    private DSL dsl;

    public AutomacaoTestPage(WebDriver driver) {
        dsl = new DSL(driver);
    }
    public void setNome(String nome){
        dsl.escreveNoCampo("elementosForm:nome",nome);
    }
}
