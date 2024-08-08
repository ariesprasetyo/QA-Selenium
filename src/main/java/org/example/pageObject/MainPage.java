package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public static WebDriver driver;
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        MainPage.driver = driver;
    }
    @FindBy( id = "btn-book-appointment")
    public WebElement bookButton;

    @FindBy(id = "chk_hospotal_readmission")
    public WebElement readmission;

    @FindBy(id = "radio_program_medicare")
    public WebElement medicare;

    @FindBy(id = "txt_visit_date")
    public WebElement visitDate;

    @FindBy(id = "txt_comment")
    public WebElement comment;

    @FindBy(xpath = "//h2[.='Appointment Confirmation']")
    public WebElement confirmationAppointmentPage;


    public boolean verifyMakeAppointmentPage(){
        return bookButton.isDisplayed();
    }

    public void clickReadmission(){
        readmission.click();
    }
    public void clickMedicare(){
        medicare.click();
    }
    public void inputVisitDate(String VisitDate){
        visitDate.sendKeys(VisitDate);
    }
    public void inputComment(String comments){
        comment.sendKeys(comments);
    }

    public void clickBookButton(){
        bookButton.click();
    }



    public boolean verifyAppointmentConfirmationPage(){
        return confirmationAppointmentPage.isDisplayed();
    }


}
