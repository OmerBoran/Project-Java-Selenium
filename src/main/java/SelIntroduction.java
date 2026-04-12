import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelIntroduction {

    public static void main(String[] args) {
        
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
    
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver(options);

       
        driver.get("https://rahulshettyacademy.com");
        
        
        System.out.println(" Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
        
        
        driver.close();
    }
}