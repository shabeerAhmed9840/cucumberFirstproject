Feature: Verifying the whether user is able to book hotel.
Scenario Outline: verifying adactin login with valid credential.
Given User is in adactin page.
When User enters "<username>" and "<password>".
Then useer is clicked login button.

 When user is selecting the location.
 When user is selecting the hotel.
 When user is selcting roomtype.
 When user is selecting number of rooms
 When user is selecting number room for adults.
 When user is selecting number of room for children.
 Then user clicking search button


When user clicking confirm button.
Then user is clicking continue button.

When user is enter his "<firstname>" and "<lastname>"
When user is enter his "<address>".
When user is enter the "<cardnumber>".
When user is select his card type.
When user is select month and year of his card.
When user is enter "<cvv>"
Then user is clicks book now button.



When user is waiting for his order number is get generate
When user is printing his order ID.
Then user is clicking logout.


 Examples:
 |username|password|firstname|lastname|address|cardnumber|cvv|
 |Ahmed7848|Welcome@123|shabeer|Ahmed|No 5 george town,new york.|1234567891234567|123|








