package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UserSteps {

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I enter user name \"([^\"]*)\"$")
    public void iEnterUserName(String userName)  {
        new LoginPage().enterUsername(userName);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);


    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I click On Admin Tab$")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdminTab();
    }

    @And("^I Verify \"([^\"]*)\" Text$")
    public void iVerifyText(String arg0)  {
        String expectedText = "System Users";
        String actualText = new AdminPage().getSystemUserText();
        Assert.assertEquals(actualText, expectedText, "Error message found");
    }

    @And("^I click on \"([^\"]*)\" Button$")
    public void iClickOnButton(String arg0)  {
        new AdminPage().clickOnAddButton();
    }
    @And("^I verify \"([^\"]*)\" Text on that field$")
    public void iVerifyTextOnThatField(String arg0)  {
        String expectedMessage = "Add User";
        String actualMessage = new AdminPage().getAddUserText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message found");
    }

    @And("^I select User Role \"([^\"]*)\"$")
    public void iSelectUserRole(String arg0) throws InterruptedException { Thread.sleep(2000);
        new ViewSystemUsersPage().selectUserRoleFromDropDown();
    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String empName) throws InterruptedException {
        Thread.sleep(3000);
        new AddUserPage().enterEmployeeName(empName);
    }



    @And("^I  enter Username \"([^\"]*)\"$")
    public void iEnterUsername(String userName) {
        new AddUserPage().enterUsername(userName);
    }

    @And("^I Select status \"([^\"]*)\"$")
    public void iSelectStatus(String arg0)  {
        new AddUserPage().clickOnStatusSelect();
        new AddUserPage().clickOnDisable();
    }

    @And("^I  enter Password \"([^\"]*)\" in password field$")
    public void iEnterPasswordInPasswordField(String password)  {
        new AddUserPage().enterPassword(password);
    }

    @And("^I enter Confirm Password  \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String password)  {
        new AddUserPage().enterConfirmPassword(password);
    }

    @And("^I  click On \"([^\"]*)\" Button on page$")
    public void iClickOnButtonOnPage(String arg0)  {
        new AddUserPage().clickOnSave();
    }

    @Then("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String arg0)  {
        String expectedSaved = "Successfully Saved";
        String actualSaved = new AddUserPage().getSuccessfullySavedText();
        Assert.assertEquals(actualSaved, expectedSaved, "Error message found");
    }


    @And("^I click On \"([^\"]*)\" Button in search field$")
    public void iClickOnButtonInSearchField(String arg0) {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("^I Verify User should be in Result List$")
    public void iVerifyUserShouldBeInResultList() throws InterruptedException {
        Thread.sleep(2000);
        String expectedList = "johnsmith1234567";
        String actualList = new ViewSystemUsersPage().getUserShouldBeInListText();
        Assert.assertEquals(actualList, expectedList, "Error message displayed");
    }


    @And("^I  enter Username \"([^\"]*)\" in username field$")
    public void iEnterUsernameInUsernameField(String name)  {
        new ViewSystemUsersPage().enterUsername(name);
    }

    @And("^Click on Check box$")
    public void clickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }

    @And("^Click on Delete Button in delete field$")
    public void clickOnDeleteButtonInDeleteField() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("^Popup will display$")
    public void popupWillDisplay() {

    }

    @And("^Click on Ok Button on Popup$")
    public void clickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteButton();
    }

    @Then("^verify message \"([^\"]*)\" user deleted$")
    public void verifyMessageUserDeleted(String arg0)  {
        String expectedText = "Successfully Deleted";
        String actualText = new ViewSystemUsersPage().getSuccessfullyDeletedText();
        Assert.assertEquals(actualText, expectedText, "Error message displayed");

    }

    @Then("^verify message \"([^\"]*)\"$")
    public void verifyMessage(String arg0) {
        String expectedText = "No Records Found";
        String actualText = new ViewSystemUsersPage().getNoRecordFoundText();
        Assert.assertEquals(actualText, expectedText, "Error message displayed");
    }

}
