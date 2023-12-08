package step_definitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.LocalDateTime;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        getDriver();
    }

    @AfterStep
    public void captureExceptionImage (Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", LocalDateTime.now().toString());
        }
    }

    @After
    public void tearDown() {
        cleanupDriver();
    }
}
