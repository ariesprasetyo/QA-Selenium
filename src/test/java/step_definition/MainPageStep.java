package step_definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.MainPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainPageStep {
    public static WebDriver driver;
    public MainPageStep(){
        super();
        this.driver = Hooks.webDriver;
    }
    @Then("User already on Main Page")
    public void userAlreadyOnMainPage() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.verifyMakeAppointmentPage());
    }

    @When("User input Form to Make Appointment {string} {string}")
    public void userInputFormToMakeAppointment(String visitDate, String comment) {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickReadmission();
        mainPage.clickMedicare();
        mainPage.inputVisitDate(visitDate);
        mainPage.inputComment(comment);
        mainPage.clickBookButton();
    }

    @Then("User already on Appointment Confirmation")
    public void userAlreadyOnAppointmentConfirmation() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.verifyAppointmentConfirmationPage());

    }
}

