package said;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SaidTestPage {
    private DSL dsl;

    public SaidTestPage(WebDriver driver) {
        dsl = new DSL(driver);
    }
    public void setNome(String nome){
        dsl.preencherCampo("elementosForm:nome",nome);
    }
    public void setSobrenome(String sobreNome){
        dsl.preencherCampo("elementosForm:sobrenome",sobreNome);
    }
    public void setSexoMasculino(){
        dsl.selecionar("elementosForm:sexo:0");
    }
    public void setSexo(){
        dsl.selecionar("elementosForm:sexo:0");
    }
    public void setComidaCarne(){
        dsl.selecionar("elementosForm:comidaFavorita:0");
    }
    public void setComidaFrango(){
        dsl.selecionar("elementosForm:comidaFavorita:1");
    }
    public void setEcolaridadeSuperior(){
        dsl.selecionarCombo("elementosForm:escolaridade","Superior");
    }
    public void setEsporte(){
        dsl.selecionarCombo("elementosForm:esportes","Futebol");
    }
    public void setTexto(String texto){
        dsl.escreveNoTextArea("elementosForm:sugestoes",texto);
    }
}
