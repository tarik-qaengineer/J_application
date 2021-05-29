

Feature: Message Functionality

Background:
  Given the user logged in as user
  When the user clicks on more tab

  Scenario: User can like a message
    When the user click on like
    Then like is displayed

  Scenario: User can add a message to favorites
      And clicks on add to favorites
      Then add to favorites needs to change

  Scenario: User can copy the link of a message
    And clicks on copy button
    Then done icon should be displayed

  Scenario: User can add recipients to a message
    And selects add recipients
    And selects user from People
    And clicks on Add button
    Then Shared with message should appear
