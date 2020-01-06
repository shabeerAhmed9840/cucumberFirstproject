$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Verifying the whether user is able to book hotel.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying adactin login with valid credential.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in adactin page.",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\".",
  "keyword": "When "
});
formatter.step({
  "name": "useer is clicked login button.",
  "keyword": "Then "
});
formatter.step({
  "name": "user is selecting the location.",
  "keyword": "When "
});
formatter.step({
  "name": "user is selecting the hotel.",
  "keyword": "When "
});
formatter.step({
  "name": "user is selcting roomtype.",
  "keyword": "When "
});
formatter.step({
  "name": "user is selecting number of rooms",
  "keyword": "When "
});
formatter.step({
  "name": "user is selecting number room for adults.",
  "keyword": "When "
});
formatter.step({
  "name": "user is selecting number of room for children.",
  "keyword": "When "
});
formatter.step({
  "name": "user clicking search button",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicking confirm button.",
  "keyword": "When "
});
formatter.step({
  "name": "user is clicking continue button.",
  "keyword": "Then "
});
formatter.step({
  "name": "user is enter his \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user is enter his \"\u003caddress\u003e\".",
  "keyword": "When "
});
formatter.step({
  "name": "user is enter the \"\u003ccardnumber\u003e\".",
  "keyword": "When "
});
formatter.step({
  "name": "user is select his card type.",
  "keyword": "When "
});
formatter.step({
  "name": "user is select month and year of his card.",
  "keyword": "When "
});
formatter.step({
  "name": "user is enter \"\u003ccvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user is clicks book now button.",
  "keyword": "Then "
});
formatter.step({
  "name": "user is waiting for his order number is get generate",
  "keyword": "When "
});
formatter.step({
  "name": "user is printing his order ID.",
  "keyword": "When "
});
formatter.step({
  "name": "user is clicking logout.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "address",
        "cardnumber",
        "cvv"
      ]
    },
    {
      "cells": [
        "Ahmed7848",
        "Welcome@123",
        "shabeer",
        "Ahmed",
        "No 5 george town,new york.",
        "1234567891234567",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying adactin login with valid credential.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in adactin page.",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Ahmed7848\" and \"Welcome@123\".",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "useer is clicked login button.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.useer_is_clicked_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is selecting the location.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_selecting_the_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is selecting the hotel.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_selecting_the_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is selcting roomtype.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_selcting_roomtype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is selecting number of rooms",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_selecting_number_of_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is selecting number room for adults.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_selecting_number_room_for_adults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is selecting number of room for children.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_selecting_number_of_room_for_children()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicking search button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_clicking_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicking confirm button.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_clicking_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is clicking continue button.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_clicking_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is enter his \"shabeer\" and \"Ahmed\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_enter_his_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is enter his \"No 5 george town,new york.\".",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_enter_his(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is enter the \"1234567891234567\".",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_enter_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select his card type.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_select_his_card_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select month and year of his card.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_select_month_and_year_of_his_card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is enter \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is clicks book now button.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is waiting for his order number is get generate",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_waiting_for_his_order_number_is_get_generate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is printing his order ID.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_is_printing_his_order_ID()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is clicking logout.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_clicking_logout()"
});
formatter.result({
  "status": "skipped"
});
});