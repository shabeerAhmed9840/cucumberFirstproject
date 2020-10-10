@smoke

Feature: Verifying the whether user is able to book hotel.
Scenario Outline: verifying adactin login with valid credential.
Given User is in adactin page.
When User enters "<username>" and "<password>".
Then useer is clicked login button.

 When user is selecting the location "<location>"
 When user is selecting the hotel"<hotel>"
 When user is selcting roomtype"<roomtype>".
 When user is selecting number of rooms 1
 When user is selecting number room for adults 2
 When user is selecting number of room for children 3.
 Then user clicking search button


When user clicking confirm button.
Then user is clicking continue button.

When user is enter his "<firstname>" and "<lastname>"
When user is enter his "<address>".
When user is enter the "<cardnumber>".
When user is select his card type"<cardtype>"
When user is select month "<month>"and year "<year>"of his card.
When user is enter "<cvv>"
Then user is click book now button.



When user is waiting for his order number is get generate
When user is printing his order ID.
Then user is clicking logout.


 Examples:
 |username|password|location|hotel|roomtype|numberOfRoom|NumnerOfAdult|NumberOfChildren|firstname|lastname|address|cardnumber|cardtype|month|year|cvv|
 |Ahmed7848|Welcome@123|Sydney|Hotel Creek|Standard|1|2|3|shabeer|Ahmed|No 5 george town,new york.|1234567891234567|VISA|January|2020|123|








