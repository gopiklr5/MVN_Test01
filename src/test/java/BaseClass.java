import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class BaseClass {
    private WebDriver driver;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();

    }

    @Test
    public void testGoogleSearch() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

    /*    WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium GitHub Actions");
        searchBox.submit();

        // Basic check: Page title contains search term
        assert driver.getTitle().toLowerCase().contains("selenium github actions");*/
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
