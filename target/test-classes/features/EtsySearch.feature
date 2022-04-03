@etsyALL
Feature: Search
  Agile story: User should be able to enter search terms and see relevant result.

  Background:
    Given User is on the Etsy home page


  Scenario: Title Verification
    Then User should see title is as expected.
    #Expected title is:
    # Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @etsyWip
  Scenario: Title Verification after search term
    When User searches "apple" in the search box
    And User clicks search button
    Then User should see "Apple" in the Etsy title

