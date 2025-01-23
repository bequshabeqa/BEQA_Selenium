package ClassWork_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class amazon {
    @Test
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");



        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Laptop");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println(" " + "Price sort info");
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();

        WebElement choise = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]"));
        Assert.assertTrue(choise.isEnabled());
        System.out.println("1. " + choise.getText());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//*[@id=\"p_123/219979\"]/span/a/div/label/i")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
        driver.get("https://www.amazon.com");

        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().forward();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span")).click();

        ((JavascriptExecutor) driver).executeScript("window.open('https://www.amazon.com/ASUS-ROG-Strix-G17-Keyboard/dp/B09CYKXBBM/ref=sr_1_1?crid=HSINQIT7BKPA&dib=eyJ2IjoiMSJ9.X5VrwHDgE5nlpNBGnz_6A1LChcF-_7HzJT3AiPwnQkAT_KZTCaBy1nm56tngqO9HuZVgR6VeNv0-SOSc0Rw_iv9IHDl5L6daLd0EXkpzoaqpeK8Gnr5a17wCBgTWX_jmU6PI8mE_AHrCefSPZT54dJLiOFdinzjHtvcWSqKqmFF50aO9n6JYg8tPJcpZm5o-pWON-gW3d6tO2tYJVC9wb2RuWiGRNr6Wl5Z0rsHf9u3eCwh2MTFazK7k8s7XhfgkP03Dq2xqDcWpnZkOzkFqz6OGr7EHRzlROkZlaMJHY3o.dq8S3Z4Gr1wI8MEk8kyXoJA3tFnINwcOSAgcBax5lLo&dib_tag=se&keywords=Laptop&qid=1733927856&refinements=p_123%3A219979&rnid=85457740011&s=electronics&sprefix=laptop%2Caps%2C319&sr=1-1&th=1', '_blank');");

        WebElement choise1 = driver.findElement(By.xpath(""));
        Assert.assertTrue(choise1.isEnabled());
        System.out.println("2. " + choise1.getText());


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.quit();
    }
}
