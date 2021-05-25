$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login fuctionality for adactin application",
  "description": "",
  "id": "login-fuctionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User enter valid username and password",
  "description": "",
  "id": "login-fuctionality-for-adactin-application;user-enter-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User launch url for adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter \"Swathika\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter \"Vnsk26\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User click login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User validate valid username and valid password",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_launch_url_for_adactin_application()"
});
formatter.result({
  "duration": 7425343100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Swathika",
      "offset": 12
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 255504200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vnsk26",
      "offset": 12
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 118912000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_click_login_button()"
});
formatter.result({
  "duration": 872279000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_validate_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 48400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User search location, hotel, date and roomtype for booking",
  "description": "",
  "id": "login-fuctionality-for-adactin-application;user-search-location,-hotel,-date-and-roomtype-for-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User click and select location for \"Sydney\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User click and select hotels for \"Hotel Creek\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click and select roomtype for \"Deluxe\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click and select number of rooms for \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enter valid check-in date as \"12/05/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter valid check-out date as \"14/05/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click and select adult per room as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click and select child per room as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click search button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User validate given details",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 36
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_location_for(String)"
});
formatter.result({
  "duration": 297143300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 34
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_hotels_for(String)"
});
formatter.result({
  "duration": 179685100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deluxe",
      "offset": 36
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_roomtype_for(String)"
});
formatter.result({
  "duration": 154290800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 43
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_number_of_rooms_for(String)"
});
formatter.result({
  "duration": 144881300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/05/2021",
      "offset": 35
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_valid_check_in_date_as(String)"
});
formatter.result({
  "duration": 106374100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14/05/2021",
      "offset": 36
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_valid_check_out_date_as(String)"
});
formatter.result({
  "duration": 105534600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 41
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_adult_per_room_as(String)"
});
formatter.result({
  "duration": 156268900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 41
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_child_per_room_as(String)"
});
formatter.result({
  "duration": 171715100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_click_search_button()"
});
formatter.result({
  "duration": 627147300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_validate_given_details()"
});
formatter.result({
  "duration": 57000,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User Click and selected hotel detail continue the process",
  "description": "",
  "id": "login-fuctionality-for-adactin-application;user-click-and-selected-hotel-detail-continue-the-process",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User click and select hotel details",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User click continue button",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_click_and_select_hotel_details()"
});
formatter.result({
  "duration": 129241900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_click_continue_button()"
});
formatter.result({
  "duration": 1277792400,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User enter personal details and payment details",
  "description": "",
  "id": "login-fuctionality-for-adactin-application;user-enter-personal-details-and-payment-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User enter first name as \"Swathika\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User enter last name as \"Venkat\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User enter address at \"chennai\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enter valid credit card number as \"6986965866668551\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User click and select  credit card type as \"VISA\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User click  and select card expiry date select month at \"11\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User click and select card expiry date select year at  \"2022\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User enter cvv number as \"5689\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click book now button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click logout button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Swathika",
      "offset": 26
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_first_name_as(String)"
});
formatter.result({
  "duration": 175512200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Venkat",
      "offset": 25
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_last_name_as(String)"
});
formatter.result({
  "duration": 175558700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chennai",
      "offset": 23
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_address_at(String)"
});
formatter.result({
  "duration": 140631400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6986965866668551",
      "offset": 40
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_valid_credit_card_number_as(String)"
});
formatter.result({
  "duration": 126327300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 44
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_credit_card_type_as(String)"
});
formatter.result({
  "duration": 148713500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 57
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_card_expiry_date_select_month_at(String)"
});
formatter.result({
  "duration": 151315600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 56
    }
  ],
  "location": "AdactinPomStepdefinition.user_click_and_select_card_expiry_date_select_year_at(String)"
});
formatter.result({
  "duration": 147245400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5689",
      "offset": 26
    }
  ],
  "location": "AdactinPomStepdefinition.user_enter_cvv_number_as(String)"
});
formatter.result({
  "duration": 107911900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_click_book_now_button()"
});
formatter.result({
  "duration": 86534000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinPomStepdefinition.user_click_logout_button()"
});
formatter.result({
  "duration": 6372272600,
  "status": "passed"
});
});