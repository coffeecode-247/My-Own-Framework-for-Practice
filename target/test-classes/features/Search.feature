Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google Search page.

  Background: User should be on Google Search page.
    Given User is on the google search page

  Scenario: Google default title verification.
    Then User should see the title is Google

  Scenario: Google Title Verification after search
    When User searches apple
    Then User should see apple in the title

  Scenario: Google Title Verification after search
    When User searches "apple"
    Then User should see "apple" in the title

  Scenario: Google Search page -about- link title
    Then User should see About link
    And User clicks to About link
    Then user should see title Google - About Google, Our Culture & Company News

    @googleTable
  Scenario: Google Search Page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search works |
      | Privacy          |
      | Terms            |
      | Settings         |