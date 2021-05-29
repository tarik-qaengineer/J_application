
Feature: Activity Stream Filter and search functions

  Scenario: AC-1 User can search and filter using different date options
    Given the user logs in as "hr"
    And the user clicks filter and search
    When the user clicks date
    Then the user selects and verifies all date options




  Scenario: AC-2 the user filter the results based on "<type>"
    Given the user logs in as "marketing"
    And the user clicks filter and search
    When the user clicks type box
    And the user selects type and search
    Then the user see the types selected in searchbox


  Scenario: AC-3 the user can search by author
    Given the user logs in as "marketing"
    And the user clicks filter and search
    And the user clicks author select box
    And the user clcicks employees and departments
    And the user selects author "hr60@cybertekschool.com"
    When the user clicks search
    Then the user see the results filtered by author "hr60@cybertekschool.com"


  Scenario: AC-4 the user can search by TO
    Given the user logs in as "marketing"
    And the user clicks filter and search
    And the user clicks TO select box
    And the user enters author "hr60@cybertekschool.com"
    When the user clicks search
    Then the user see the results filtered by TO "hr60@cybertekschool.com"

  Scenario: AC-5 the user can add field
    Given the user logs in as "marketing"
    And the user clicks filter and search
    And the user clicks add field
    And the user selects tag
    And the user enters "@smoke" in tagBox
    When the user clicks search
    Then the user see the results filtered by TAG "@smoke"


  Scenario Outline: AC-6 the user can filter the results based on "<filter>"
    Given the user logs in as "hr"
    And the user clicks filter and search
    When the user clicks "<filter>" option in search
    Then the user can verify the results filtered by "<filter>"
    Examples:
      | filter        |
      | work          |
      | workflows     |
      | announcements |
      | favorites     |
      | my activity   |


  Scenario: AC-7 the user can save a search
    Given the user logs in as "hr"
    And the user clicks filter and search
    And the user clicks save filter
    And the user enters filter name "newFilter"
    When the user clicks save
    Then the user see "newFilter" is available