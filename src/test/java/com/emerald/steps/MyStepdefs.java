package com.emerald.steps;

import com.emerald.pages.MarketingPages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.text.ParseException;


public class MyStepdefs {

    MarketingPages marketingPages = new MarketingPages();

    @Given("^user is on marketing page$")
    public void userIsOnMarketingPage() {

    }

    @And("^I accept the consent$")
    public void iAcceptTheConsent() {
        marketingPages.clickOnAcceptButton();
    }

    @When("^I click on last month link in year filter$")
    public void iClickOnLastMonthLinkInYearFilter() {
        marketingPages.clickOnLastMonthLink();
        //marketingPages.clickOnPerPage20();
    }

    @Then("^I should verify that book part arrange with last month publication date$")
    public void iShouldVerifyThatBookPartArrangeWithLastMonthPublicationDate() throws ParseException {
        marketingPages.VerifyPublicationByMonth();
    }

    @When("^I click on last week link in year filter$")
    public void iClickOnLastWeekLinkInYearFilter() {
        marketingPages.clickOnLastWeekLink();
       // marketingPages.clickOnPerPage20();
    }

    @Then("^I should verify book part arrange with last week date$")
    public void iShouldVerifyBookPartArrangeWithLastWeekDate() {
        marketingPages.verifyPublicationByWeek();
    }



}
