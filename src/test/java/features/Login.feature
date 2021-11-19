 @LoginFeature
 Feature: Login Feature

  Background:
  Given user has navigated to the Login Page
  
  @Regression
  Scenario: Positive Login Scenario
  Given user has navigated to the Login Page
  When user enter correct username and password
  And user clicks on Login Button
  Then user should be exit
  
  @Test2
  Scenario: Negative Login Scenario
  When user enter correct username "reha@gmail.com" and password "Ahsdj12@Reahj"
  And user clicks on Login Button
  Then user should be exit
  
  @Test3
  Scenario Outline: Negative Login Scenario
  When user enter correct username "<Username>" and password "<Password>"
  And user clicks on Login Button
  Then user should be exit
  
  Examples:
  | Username       | Password      |
  | Asc@gmail.com  | Adsfg1@Reahj  |
  | reha@gmail.com | Ahsdj12@Reahj |
  
  @Test4
  Scenario Outline: Negative Login Scenario
  When user enter correct username "<Username>" and password "<Password>"
  And user clicks on Login Button
  Then you should get error messgae"<Error>"
  
  Examples:
  | Username       | Password      | Error                                              |
  | Asc@gmail.com  | Adsfg1@Reahj  | The email or password you have entered is invalid. |
  | reha@gmail.com | Ahsdj12@Reahj | The email or password you have entered is invalid. |
 
 
 @DataTable 
  Scenario:  datatable
    When user enter correct credentials
      | Field          | Value         |
      | Asc@gmail.com  | Adsfg1@Reahj  |
      | reha@gmail.com | Ahsdj12@Reahj |
    And user clicks on Login Button
    Then user should be exit
