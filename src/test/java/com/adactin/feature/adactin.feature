Feature: Login fuctionality for adactin application

Scenario: User enter valid username and password
Given User launch url for adactin application
When User enter "Swathika" as username
And User enter "Vnsk26" as password
And User click login button
Then User validate valid username and valid password 


Scenario: User search location, hotel, date and roomtype for booking
Given User click and select location for "Sydney"
When User click and select hotels for "Hotel Creek"
And User click and select roomtype for "Deluxe"
And User click and select number of rooms for "2"
And User enter valid check-in date as "12/05/2021"
And User enter valid check-out date as "14/05/2021"
And User click and select adult per room as "2"
And User click and select child per room as "2"
And User click search button
Then User validate given details



Scenario: User Click and selected hotel detail continue the process
Given User click and select hotel details
When User click continue button

Scenario: User enter personal details and payment details
Given User enter first name as "Swathika"
When User enter last name as "Venkat"
And User enter address at "chennai"
And User enter valid credit card number as "6986965866668551"
And User click and select  credit card type as "VISA"
And User click  and select card expiry date select month at "11"
And User click and select card expiry date select year at  "2022"
And User enter cvv number as "5689"
And User click book now button
And User click logout button
