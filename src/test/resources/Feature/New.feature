Feature: Verifying user can shop online.
Scenario Outline: Verifying whether user can able to choose multiple product.
When user is in  skateClothing login page.
And user logged in using "<username>"and "<password>"
And user click the login button
And user searching "<product>" in the search bar
And  clicked search button.
Then user printed all product in the consoul.

Examples:
  |username|password|product|
  |ahmedshabeer1996@gmail.com|9840585752msA|shirts|
  
  
  
  
  
  
 





