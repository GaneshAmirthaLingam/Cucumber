Feature: Validate the Personal Loan Module

Scenario: User can apply personal loan in ICICI Website

    Given Customer can open the ICICI Bank Webpage
    And Customer can check the List of Loan Options and click Personal Loan
    When Customer can click the apply loan
    Then Customer read the documents to apply loan
    And Customer enter the require amount and fill tenure period to repay loan amount  
    Then Customer fill the necessary information
    And Customer click the checkbox 


   
