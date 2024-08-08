package step_definition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    public static WebDriver webDriver;
    @Before
    public void setUp() {
        webDriver = new FirefoxDriver();
        String url = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }
    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}
