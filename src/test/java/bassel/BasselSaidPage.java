package bassel;

import org.openqa.selenium.WebDriver;

public class BasselSaidPage {
    private DSL dsl;

    public BasselSaidPage(WebDriver driver) {
        dsl = new DSL(driver);
    }
    public void setNome(String nome){
        dsl.escreveNoCampo("elementosForm:nome","BASSEL");
    }
}
