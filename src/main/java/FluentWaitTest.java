import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException; // Selenium'un kendi kütüphanesi şart
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.List;

public class FluentWaitTest {

    public static void main(String[] args) {        
        
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");      
        WebDriver driver = new ChromeDriver();        
        
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");        
        driver.findElement(By.cssSelector("[id='start'] button")).click();

        
        try {
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(3))
                    .ignoring(NoSuchElementException.class);

            WebElement foo = wait.until(d -> {
                List<WebElement> finishElements = d.findElements(By.cssSelector("#finish h4"));
                return !finishElements.isEmpty() && finishElements.get(0).isDisplayed()
                        ? finishElements.get(0)
                        : null;
            });

            System.out.println(foo.getText());
        } finally {
            driver.quit();
        }
    }
}