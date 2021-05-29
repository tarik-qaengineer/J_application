$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should not be able to try logging in more than 5 times with invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user try to login 5 times with \"\u003cInvalid_userType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the allert should not be \"Incorrect login or password\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Invalid_userType"
      ]
    },
    {
      "cells": [
        "invalid"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should not be able to try logging in more than 5 times with invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user try to login 5 times with \"invalid\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.crm.step_definitions.LoginPageStepDefs.the_user_try_to_login_times_with(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the allert should not be \"Incorrect login or password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.crm.step_definitions.LoginPageStepDefs.the_allert_should_not_be(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertFalse(Assert.java:65)\r\n\tat org.junit.Assert.assertFalse(Assert.java:75)\r\n\tat com.crm.step_definitions.LoginPageStepDefs.the_allert_should_not_be(LoginPageStepDefs.java:91)\r\n\tat ✽.the allert should not be \"Incorrect login or password\"(file:///C:/Users/trans/IdeaProjects/CRM_SP4/src/test/resources/features/login.feature:24)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});