$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 2,
  "name": "Verification of the Home Page",
  "description": "",
  "id": "verification-of-the-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@deploymentsuite"
    }
  ]
});
formatter.before({
  "duration": 1700001,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enters the appication url",
  "keyword": "When "
});
formatter.match({
  "location": "Home.user_opens_browser()"
});
formatter.result({
  "duration": 9910225200,
  "status": "passed"
});
formatter.match({
  "location": "Home.enters_the_appication_url()"
});
formatter.result({
  "duration": 1122752800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Check whether user is able to access the Home page screen",
  "description": "",
  "id": "verification-of-the-home-page;check-whether-user-is-able-to-access-the-home-page-screen",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user should successfully navigates the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Home.user_should_successfully_navigates_the_homepage()"
});
formatter.result({
  "duration": 5801137001,
  "status": "passed"
});
});