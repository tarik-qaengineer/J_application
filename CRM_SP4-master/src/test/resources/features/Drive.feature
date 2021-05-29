
Feature: Drive Functions
@wip
  Scenario Outline: Authorised "<user>" user can display "<drive>" and "<drive2>"
    Given the user logs in as "<user>"
    And the user navigates to "Drive" page
    When the user clicks "<drive>"
    Then the user can display "<drive>" window
    When the user clicks "<drive2>"
    Then the user can display "<drive2>" window

    Examples:
      | user      |  | drive    |  | drive2        |
      | hr        |  | my drive |  | company drive |
      | helpdesk  |  | my drive |  | company drive |
      | marketing |  | my drive |  | company drive |

