$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("filter.feature");
formatter.feature({
  "line": 1,
  "name": "Verify year filter",
  "description": "As a user i would like to filter book part",
  "id": "verify-year-filter",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7445302800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is on marketing page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "As user i would like to filter book part monthly",
  "description": "",
  "id": "verify-year-filter;as-user-i-would-like-to-filter-book-part-monthly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I click on last month link in year filter",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on per Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should verify that book part arrange with last month publication date",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iClickOnLastMonthLinkInYearFilter()"
});
formatter.result({
  "duration": 1767916800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnPerPage()"
});
formatter.result({
  "duration": 1605644900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldVerifyThatBookPartArrangeWithLastMonthPublicationDate()"
});
formatter.result({
  "duration": 427359300,
  "error_message": "java.lang.AssertionError: null\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.fail(Assert.java:103)\r\n\tat com.emerald.pages.MarketingPages.VerifyPublicationByMonth(MarketingPages.java:58)\r\n\tat com.emerald.steps.MyStepdefs.iShouldVerifyThatBookPartArrangeWithLastMonthPublicationDate(MyStepdefs.java:26)\r\n\tat ✽.Then I should verify that book part arrange with last month publication date(filter.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 164896700,
  "status": "passed"
});
formatter.before({
  "duration": 4051274300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is on marketing page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 11,
  "name": "As user i would like to filter book part weekly",
  "description": "",
  "id": "verify-year-filter;as-user-i-would-like-to-filter-book-part-weekly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I click on last week link in year filter",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on per Page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should verify book part arrange with last week date",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iClickOnLastWeekLinkInYearFilter()"
});
formatter.result({
  "duration": 1531685100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnPerPage()"
});
formatter.result({
  "duration": 1604782300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldVerifyBookPartArrangeWithLastWeekDate()"
});
formatter.result({
  "duration": 14450400,
  "status": "passed"
});
formatter.after({
  "duration": 56500,
  "status": "passed"
});
});