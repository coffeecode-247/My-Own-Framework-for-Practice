@LoginWithBackground
Feature: Login feature
  Agile Story: As a user, I should be able to login with
  correct credentials to different accounts. And dashboard should be displayed.

  Background:
    User is on the login page

  Scenario: Librarian login scenario.
    When User logs in as librarian
    Then User should see dashboard

  Scenario: Student Login Scenario
    When User logs in as student
    Then User should see dashboard

    @db
  Scenario: Admin Login Scenario
      #BEFORESTEP Runs Here
    When User logs in as admin
      #AFTERSTEP Runs Here
      #BEFORESTEP Runs Here
    Then User should see dashboard
      #AFTERSTEP Runs Here