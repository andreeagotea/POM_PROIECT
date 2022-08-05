package test;

import com.evozon.helper.Constante;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", Constante.CHROME_URL);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Constante.BASE_URL);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
