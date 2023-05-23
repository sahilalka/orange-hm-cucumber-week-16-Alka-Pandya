package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @Then("^Verify \"([^\"]*)\" Message on page$")
    public void verifyMessageOnPage(String arg0)  {
        String expectedMessage = "Dashboard";
        String actualMessage = new DashboardPage().getDashboardText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message found");
    }

    @Then("^Verify Logo is Displayed$")
    public void verifyLogoIsDisplayed() {
        // new LoginPage().verifyLogoIsDisplayed();
    }

    @And("^I Click on User Profile logo$")
    public void iClickOnUserProfileLogo() {
        new LoginPage().clickOnUserProfileLogo();
    }

    @And("^I Mouse hover on \"([^\"]*)\" and click$")
    public void iMouseHoverOnAndClick(String arg0)  {
        new LoginPage().mouseHoverAndClickOnLogout();

    }

    @Then("^Verify the text \"([^\"]*)\" is displayed$")
    public void verifyTheTextIsDisplayed(String arg0) {
        String expectedMessage = "Login";
        String actualMessage = new LoginPage().getLoginText();
        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage, expectedMessage, "Error message displayed");
    }
}
