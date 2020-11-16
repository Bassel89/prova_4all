package campotrenameinto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomatizadoPage {
    private DSL dsl;
    private WebDriver driver;

    public TestAutomatizadoPage(WebDriver driver) {
        dsl = new DSL(driver);
    }
    public void setNome(String nome){
        dsl.escreveNoCampo("elementosForm:nome",nome);
    }
    public void setSobrenome(String sobrenome){
        dsl.escreveNoCampo("elementosForm:sobrenome",sobrenome);
    }
    public void setSexoMasculino(){
        dsl.clicarNoRadio("elementosForm:sexo:0");
    }
    public void setComidaCarne(){
        dsl.clicarNoRadio("elementosForm:comidaFavorita:0");
    }
    public void setComidaPizza(){
        dsl.clicarNoRadio("elementosForm:comidaFavorita:2");
    }
    public void setEscolaridade(String valor){
        dsl.selecionarEscolaridade("elementosForm:escolaridade",valor);
    }
    public void setEsport(String... valores){
        for(String escolha:valores)
            dsl.selcionarEsport("elementosForm:esportes",escolha);
    }
    public void cadastrar(){
        dsl.cadastrar("elementosForm:cadastrar");
    }
    public void clicaNoBotaoConfirmar(){
        dsl.clicarBotãoConfirmar("confirm");
    }
    public void clicaNoBotao(){
        dsl.clicaNoBotao("//*[@id=\"elementosForm:tableUsuarios\"]/tbody/tr[1]/td[3]/input");
    }
}













