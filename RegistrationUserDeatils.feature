@Register
Feature: User registration in Retail upskill
  I want to register the uaer in retail upskill

  @RegisterUser
  Scenario: Register the user
  	Given I am on retail upskill website
  	When I enter the firstname
  	| FirstName | TestFirst  |
  		And enter lastname
    | LastName   | TestLast |
    And enter email
    | Email   | test@gmail.com |
    And enter moblenum
    | Mobile   | 9876543210 |
    And enter address1
    | Address1   | TestAddOne |
    And enter address2
    | Address2   | TestaddTwo |
    And enter city
    | City   | Banglore |
    And enter post code
    | Post Code   | 560022 |
    And enter country
    | Country   | India |
    And enter region
    | Region   | Karnataka |
    And enter password
    | Password   | manzoor1 |
    And enter confirm password
    | ConfirmPassword   | manzoor1 |
    And select the radio button to subscribe
    And select the checkbox for agree provacy policy
    And click on continue
  
  
   @UserLoggin
  Scenario: Login to my account
    Given I am on retail upskill website
    When I enter userid and password
      | Userid | n2@gmail.com |
      | Password   | manzoor1  |
    Then User is logged in successfully
    
    
  