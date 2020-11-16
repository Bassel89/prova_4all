package bassel;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasselSaid {
    private WebDriver driver;
    private DSL dsl;
    private BasselSaidPage page;
    @Before
    public void comecar(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        dsl = new DSL(driver);
        page = new BasselSaidPage(driver);
        driver.navigate().to("file:///C:/Users/BASSEL/OneDrive/Desktop/componentes.html");
    }
    @Test
    public void meuTestAqui(){
    page.setNome("BASSEL");
    }
}
