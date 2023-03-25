Feature: Signup Feature

  @regression @smoke @sanity  @hb
  Scenario: User should be able to create a brand new email with unique email address
    Given user in TalentTEK Homepage
    And user click on "Create new account" button
    And user enter First and Last Name
    And user enter Password
    And user enter Confirm Password
    And user enter month under Birth Date
    And user enter date under Birth Date
    And user enter year under Birth Date
    And user enter Female under the gender
    Then click on" By clicking Create my account, you agree to our Terms and that you have read our Data Use Policy, including our Cookie Use".
  Then user clicks on "Create my account"

