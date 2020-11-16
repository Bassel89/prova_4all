package testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JanelasTest {
    @Test
    public void testTrocarJanelas(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://aplic.inmetrics.com.br/");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/a/img")).click();
        driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
        //driver.switchTo().window("Portal do Colaborador - Entrar");
         driver.findElement(By.id("txtUsuario")).sendKeys("basselsa");
         driver.findElement(By.id("txtSenha")).sendKeys("M@trix88644");
        driver.findElement(By.id("btnLogin")).click();
        driver.close();
        driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[9]/div/a/img")).click();
        driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
        driver.findElement(By.id("fun_Id")).sendKeys("asda");
    }
}
