package testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prova {
    @Test
    public void gerarDados() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\BASSEL\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Acessar o site para gerar pessoa
        driver.navigate().to("https://www.fakenamegenerator.com/");
        //Pegar o primeiro nome e salvá-lo em variavel chama nome
        String nome = driver.findElement(By.tagName("strong")).getText();
        //Pegar sobrenome e salvá-lo em variável chama sobrenome
        String sobrenome = driver.findElement(By.tagName("dd")).getText();
        //Pegar userame para usar como email e salvá-lo em variável username
        //String username = driver.findElement(By.xpath("//*[@id=\"details\"]/div[2]/div[2]/div/div[2]/dl[10]/dd")).getText();
        driver.navigate().to("https://site112.com/gerador-username");
        driver.findElement(By.className("minimalmini")).click();
        String username = driver.findElement(By.xpath("//*[@id=\"usernameresult\"]/div[2]/table/tbody/tr[2]/td[2]")).getText();
        //Acessa site gmail para cadastrar
        driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fe-11-15e9226eb9419c7ff90ddf3a01cea409-fe24559afe4d4efabdca6e15fdf205aa414807d5&flowName=GlifWebSignIn&flowEntry=SignUp");
        //Preencher campo name com o valor que pegou do outro site
        driver.findElement(By.id("firstName")).sendKeys(nome);
        //Preencher campo name com o valor que pegou do outro site
        driver.findElement(By.id("lastName")).sendKeys(sobrenome);
        //Clica no campo username para ver se ele vai gerar user name aleatório e limpar esse campo
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).clear();
        Thread.sleep(2000);
        //Pegar o nome que preencheu em campo first name e salvá-lo em variável chama email
        //String email = driver.findElement(By.id("firstName")).getAttribute("value");
        //Preencher o campo user name com o valor que preencheu em campo first name
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
        //driver.findElement(By.xpath("\"//*[@id=\\\"username\\\"]\"")).sendKeys(username);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Inm@2020");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Inm@2020");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/span/span")).click();
        //driver.close();

    }

}
