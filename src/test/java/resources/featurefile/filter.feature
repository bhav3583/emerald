Feature: Verify year filter
  As a user i would like to filter book part

  Background: User is on marketing page
    Given user is on marketing page
    And I accept the consent

  Scenario: As user i would like to filter book part monthly
    When I click on last month link in year filter
    Then I should verify that book part arrange with last month publication date

Scenario: As user i would like to filter book part weekly
  When I click on last week link in year filter
  Then I should verify book part arrange with last week date