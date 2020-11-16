package Webmotors;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBusca {
    private WebDriver driver;
    @Before
    public void buscandoCarroHonda(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.webmotors.com.br");

    }
    @Test
    public void testCampoBusca(){

    }


}
