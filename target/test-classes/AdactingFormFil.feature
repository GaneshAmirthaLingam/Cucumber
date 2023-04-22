Feature: validate the adactin hotel booking page

  Scenario Outline: 
    Given user is on Adactin Login page
    When user enter given valid  "<username>" and "<password>"
    And user click on login button
    Then you are successfully login
    When user as Select "<Location>"
    And user to Select "<Hotel>"
    Then user Select a "<Room Type>"
    And user as "<Number of Rooms>"
    Then user as to Select "<Check In Date>"
    And user as for Select "<Check Out Date>"
    Then user to a Select "<Adults per Room>"
    And user for Select "<Children per Room>"
    Then user as click for Search button
    Then user click the radio button and click the continue
    And user as give the "<First Name>"
    Then user as give to the "<Last Name>"
    And user given the "<Billing Address>"
    Then user as give a "<Credit Card No>"
    And user as Select the "<Credit Card Type>"
    Then user as Select to the "<Expiry Date Month>" and "<Expiry Date Year>"
    And user give a "<CVV Number>"
    Then user Click the BookNow button
    Then user Click the MyItinerary
    And user get the OrderNo
    And user Click the Logout button
    Then user get the successfully logged out message

    Examples: 
      | username  | password    | Location | Hotel        | Room Type | Number of Rooms | Check In Date | Check out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address                                 | Credit Card No   | Credit Card Type | Expiry Date Month | Expiry Date Year | CVV Number |
      | GaneshA10 | Naturejo@88 | Berlin   | Hotel Hilton | Double    | 3 - Three       | 04/10/2022    | 23/10/2022     | 3 - Three       | 3 - Three         | Ganesh     | A         | No 27, 2nd Cross Street, Dharmapuri, Puducherry | 3752432556988745 | Master Card      | July        |             2022 |        973 |
