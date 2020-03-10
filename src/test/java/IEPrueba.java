import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class IEPrueba {

        public WebDriver driver;

        @BeforeClass
        public void setUp() throws InterruptedException {
            System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            Thread.sleep(100);
            driver.manage().window().maximize();
        }

        @Test
        public void testGooglePageTitleInIEBrowser() throws InterruptedException {
            driver.get("https://www.google.com/?gws_rd=ssl#spf=1583872046965");
            Assert.assertEquals(driver.getTitle(), "Google");
        }

        @AfterClass
        public void tearDown() {
            if(driver!=null) {
                System.out.println("Closing IE browser");
                driver.quit();
            }
        }
}
