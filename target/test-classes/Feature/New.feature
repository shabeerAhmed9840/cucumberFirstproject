Feature: Verifying user can shop online.
   @Reg
  Scenario Outline: Verifying whether user can able to choose multiple product.
    Given User is in skateclothing login page
    When user logged in using "<username>"and "<password>"
    And user click the login button
    And user searching "<product>" in the search bar
    And clicked search button.
    And user printed all product in the consoul.
    Then user closing the browser.

    Examples: 
      | username                   | password      | product |
      | ahmedshabeer1996@gmail.com | 9840585752msA | shirts  |
   @Smoke
  Scenario Outline: Verifying whether user can able to choose multiple product.
    Given User is in skateclothing login page
    When user logged in using "<username>"and "<password>"
    And user click the login button
    And user searching "<product>" in the search bar
    And clicked search button.
    And user printed all product in the consoul.
    Then user closing the browser.

    Examples: 
      | username                   | password      | product |
      | ahmedshabeer1996@gmail.com | 9840585752msA | shoes  |
   @fun
  Scenario Outline: Verifying whether user can able to choose multiple product.
    Given User is in skateclothing login page
    When user logged in using "<username>"and "<password>"
    And user click the login button
    And user searching "<product>" in the search bar
    And clicked search button.
    And user printed all product in the consoul.
    Then user closing the browser.

    Examples: 
      | username                   | password      | product |
      | ahmedshabeer1996@gmail.com | 9840585752msA | hoodes  |
