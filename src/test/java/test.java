import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class test {

        public static void main(String[] args) {

            test();


        }

        public static <your> void test() {

            System.getProperty("WebDriver.chrome.driver");
            WebDriver driver = new ChromeDriver();

            //go to google.com
            driver.get("https://www.google.com");

            //enter text in search box
            driver.findElement(By.name("q")).sendKeys("Automation step by step");

            //click on search button
            driver.findElement(By.name("btnK")).click();

            //close browser
            driver.close();

            System.out.println("Test completed");

        }
    }