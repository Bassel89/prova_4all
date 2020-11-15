package desafio4All;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Desafio2 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testDesafio2() throws Exception {
        driver.get("https://shopcart-challenge.4all.com/");
        driver.findElement(By.id("open-categories-btn")).click();
        driver.findElement(By.id("category-0")).click();
        driver.findElement(By.id("add-product-0-btn")).click();
        driver.findElement(By.id("add-product-1-btn")).click();
        driver.findElement(By.id("add-product-2-btn")).click();
        driver.findElement(By.id("open-categories-btn")).click();
        driver.findElement(By.id("category-all")).click();
        driver.findElement(By.id("add-product-3-btn")).click();
        driver.findElement(By.xpath("//button[@id='cart-btn']/img")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='remove-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='remove-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='remove-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='remove-product-3-qtd']/span")).click();
        driver.findElement(By.xpath("//div[@id='root']/div[2]")).click();
        driver.findElement(By.id("finish-checkout-button")).click();
        driver.findElement(By.xpath("//div[@id='root']/div[3]/div/div/div/h2")).click();
        assertEquals("Pedido realizado com sucesso!", driver.findElement(By.xpath("//div[@id='root']/div[3]/div/div/div/h2")).getText());
        driver.findElement(By.xpath("//div[@id='root']/div[3]/div/div/div/button")).click();
        driver.close();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
