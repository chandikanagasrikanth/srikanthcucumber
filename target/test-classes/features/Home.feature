@deploymentsuite
Feature: Verification of the Home Page
  
  Background: 
  Given user opens browser
  When enters the appication url

  @smoke
  Scenario: Check whether user is able to access the Home page screen
    Then user should successfully navigates the homepage

  @regression
  Scenario: Check whether user is able to find the navigation contents
    Then user should find the below contents
      | Women | Men | Training | Gear | Sale |

  @regression
  Scenario Outline: Verification of Login functionality
    And user clicks on sigin link
    # And user enters <email>  <password>
    And user enters "<username>" and "<password>" credentials

    Examples: 
      | username      | password |
      | tom@gmail.com | 123$$    |
      |      98644456 | 1235%    |
