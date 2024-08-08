package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    final private WebDriver driver;
    public LoginSteps() {
        super();
        this.driver = Hooks.webDriver;

    }

    @Given("User already on Login Page")
    public void verifyOnLoginPage(){
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.verifyOnLoginPage());
    }

    @When("User input {string} as userName and input {string} as password")
    public void login(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

}
