import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarEnableDisable {

    public static void main(String[] args) throws InterruptedException {

        
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        
        System.out.println("Style attribute before clicking: " + driver.findElement(By.id("Div1")).getAttribute("style"));

        
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        
        System.out.println("Style attribute after clicking: " + driver.findElement(By.id("Div1")).getAttribute("style"));

       
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            
            System.out.println("its enabled");
            Assert.assertTrue(true);
            
        } else {
            
            System.out.println("its disabled");
            Assert.assertTrue(false);
            
        }
        
        // driver.quit();
    }
}