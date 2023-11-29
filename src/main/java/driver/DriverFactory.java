package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    private DriverFactory() {
    }

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            try {
                webDriver.set(createDriver());
            } catch (IOException e) {
                throw new WebDriverInitException(e);
            }
        }
        return webDriver.get();
    }

    private static WebDriver createDriver() throws IOException {
        WebDriver driver;

        switch (getBrowserType()) {
            case "firefox" -> {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/driver/drivers/geckodriver");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new FirefoxDriver(firefoxOptions);
            }
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver(chromeOptions);
            }
            default -> throw new IllegalStateException("Unexpected value: " + getBrowserType());
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static String getBrowserType() throws IOException {
        String browserType;
        String browserTypeRemoteValue = System.getProperty("browserType");

        if (browserTypeRemoteValue == null || browserTypeRemoteValue.isEmpty()) {
            try (FileInputStream file = new FileInputStream(System.getProperty("user.dir")
                    + "/src/main/java/properties/config.properties")) {
                Properties properties = new Properties();
                properties.load(file);
                browserType = properties.getProperty("browser").toLowerCase().trim();
            }
        } else {
            browserType = browserTypeRemoteValue;
        }
        return browserType;
    }

    public static void cleanupDriver() {
        webDriver.get().quit();
        webDriver.remove();
    }
}
