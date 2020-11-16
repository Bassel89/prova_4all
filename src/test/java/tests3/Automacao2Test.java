package tests3;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao2Test {
    private WebDriver driver;
    @Test
    public void testComponentes(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();

    }
}
