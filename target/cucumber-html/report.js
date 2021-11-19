$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has navigated to the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_has_navigated_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Positive Login Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user has navigated to the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_has_navigated_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter correct username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_enter_correct_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be exit",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_be_exit()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});