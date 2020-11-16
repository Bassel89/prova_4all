package testes2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CadastrarUsuario {
    private WebDriver driver1;
    private DSL dsl;
    @Before
    public void inicializando(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/campo-treinamento/componentes.html");
        dsl = new DSL(driver1);

    }
    @Test
    public void cadastrar(){
        //Preencher o campo nome e sobrenome
        dsl.escreve("elementosForm:nome","Bassel");
        //driver1.findElement(By.id("elementosForm:nome")).sendKeys("Bassel");
        dsl.escreve("elementosForm:sobrenome","Said");
        //driver1.findElement(By.id("elementosForm:sobrenome")).sendKeys("Said");
        //Escolher radio bottom
        dsl.clicarRadioBottom("elementosForm:sexo:0");
        //driver1.findElement(By.id("elementosForm:sexo:0")).click();
        //Escolher chexbox qual sua comida favorita
        driver1.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        driver1.findElement(By.id("elementosForm:comidaFavorita:1")).click();
        //Select escolaridade
        //new Select(driver1.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
        dsl.selecionarCombo("elementosForm:escolaridade","Superior");
        //Select esportes
        dsl.selecionarCombo("elementosForm:esportes","Corrida");
        //new Select(driver1.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
        dsl.selecionarCombo("elementosForm:esportes","Futebol");
        //new Select(driver1.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Futebol");

        //Escrever no campobox
        dsl.escreve("elementosForm:sugestoes","Não tem sugestão");
        //driver1.findElement(By.id("elementosForm:sugestoes")).sendKeys("Não tem sugestão");
        //Clicar em clique aqui
        driver1.findElement(By.xpath("//*[@id=\"elementosForm:tableUsuarios\"]/tbody/tr[1]/td[3]/input")).click();
        //Interagir com alreta tem que mudar o foco do driver para a janela da alerta
        Alert alerta = driver1.switchTo().alert();
        String textAlerta = alerta.getText();
        alerta.accept();
        //Mudar o foco do driver para a página
        driver1.switchTo().defaultContent();
        //preencher o texto que pegou da janela alerta e preencher no campo input
        driver1.findElement(By.xpath("//*[@id=\"elementosForm:tableUsuarios\"]/tbody/tr[1]/td[6]/input")).sendKeys(textAlerta);
        //Clicar em cadastrar
        driver1.findElement(By.id("elementosForm:cadastrar")).click();
        //Assert pra verificar se realmento cadastrou
        Assert.assertTrue(driver1.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
        //Interagir com frame mudando o foco do driver para frame
        driver1.switchTo().frame("frame1");
        driver1.findElement(By.id("frameButton")).click();
        //Pegar o texto dentro da frame e salva-lo
        Alert alertaFrame = driver1.switchTo().alert();
        String textoFrame = alertaFrame.getText();
        alertaFrame.accept();
        //Mudar o foco do driver novamente para a página principal
        driver1.switchTo().defaultContent();
        //Limpar o texto dentro da textarea da sugestão
        driver1.findElement(By.id("elementosForm:sugestoes")).clear();
        driver1.findElement(By.id("elementosForm:sugestoes")).sendKeys(textoFrame);
        //Clicar em botao popup
        driver1.findElement(By.id("buttonPopUpEasy")).click();
        driver1.switchTo().window("Popup");
        driver1.findElement(By.tagName("textarea")).sendKeys("Escrevendo dentro texto area");
        driver1.close();
        //Mudar o foco para a página principal
        driver1.switchTo().window("");
        //Clicar no botao abrir popup do mal
        driver1.findElement(By.id("buttonPopUpHard")).click();
        //Para navigar entre as abas
        List<String> abas = new ArrayList<String>(driver1.getWindowHandles());
        driver1.switchTo().window(abas.get(1));
        driver1.findElement(By.tagName("textarea")).sendKeys("hshshshsh");
        driver1.close();
    }
    @After
    public void finalizando(){
        //driver1.quit();
    }
}
