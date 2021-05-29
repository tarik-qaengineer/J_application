Feature: Login Page

@smoke

  Scenario Outline: Login with different accounts <userType>
      Given the user logged in as "<userType>"
    Examples:
    | userType |
    | HR       |
#    | Helpdesk |
#    | Marketing|

@smoke

  Scenario Outline: User should not be able to login with <Invalid_userType>
    But the user can not logged in as "<Invalid_userType>"
    Examples:
      | Invalid_userType |
      | invalid          |
      |                  |

  @wip
  Scenario Outline: User should not be able to try logging in more than 5 times with invalid credentials.
    Given the user try to login 5 times with "<Invalid_userType>"
    Then the allert should not be "Incorrect login or password"
    Examples:
      | Invalid_userType |
      | invalid          |


  Scenario Outline: User should be able to logout automatically after 30 mins if user is "AFK"
      Given the user logged in as "<userType>"
      When user is AFK 30 mins long
      Then user should not able to navigate any page
      Examples:
        | userType |
        | HR       |
        | Helpdesk |
        | Marketing|
