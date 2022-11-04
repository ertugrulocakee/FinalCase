package Tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

   public WebDriver driver;

    @BeforeClass
    @Parameters({ "browser" })
    public void Setup(String browser) {
        if (browser.contains("Chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-blink-features");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.addArguments("--disable-extensions");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

        }

        if (browser.contains("Edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--disable-blink-features");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.addArguments("--disable-extensions");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(options);
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com");
    }


    @AfterClass()
    public void afterTest()  {

        driver.quit();

    }


}
