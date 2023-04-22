Feature: Facebook Application Validation

  Scenario Outline: Facebook validation using Different Credentials
    Given User able to launch the Facebook url
    When User enters the "<Username>" and "<password>"
    And User clicks on the LoginButton
    Then User validates the Error Message

    Examples: 
      | Username    | password |
      | ram@Sarath  |     1234 |
      | Arun@1343   |   234543 |
      | Balu@java   |     8765 |
      | Sundar@Babu |  2343432 |
