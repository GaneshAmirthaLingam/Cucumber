Feature: Validation of Instagram Home page 
 
Scenario: 
    Given Validation the Instagram Home Page using Incorrect username and InCrt password
    When user enters the username and password
    And user confirm Login button isEnable
    Then user validates the homepage
    

  
  