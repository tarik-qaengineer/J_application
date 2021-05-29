@regression 
Feature: Company Page

  Scenario Outline: Only valid for "HR" users.
    Given the user can be logged in as "<UserTyepe>"
    When User can display News window by clicking on News button. Only valid for "HR" users.
    And User can display Add News window by clicking on Add News button. Only valid for "HR" users.
     Examples:
    |UserTyepe|
    |HR       |


    Scenario Outline: It is not valid for except "HR" users
      Given the user can be logged in as "<UserTyepe>"
      When User can not display News window by clicking on Add News button. It is not valid for "Helpdesk" users.
      And User can not display Add News window by clicking on Add News button. It is not valid for "Helpdesk" users.

      Examples:
        |UserTyepe|
        |Helpdesk |
        |Marketing|


   Scenario:Display the windows by clicking subtitle
    Given The user logged in as "HR"
    And User can display "Official Information" by clicking on "Official Information" tab.
    And User can see "Our Life" window by clicking on "Our Life" tab.
    And User can see "About Company" window by clicking on "About Company" Tab.
    And User can see an album and photos page by clicking "Photo Gallery" tab.
    And User can display vacancy button by clicking "Career" tab.
    And User can display the news under Business News(RSS) menu.


  Scenario:Video Player
    Given The user logged in as "HR"
    Then User can display video player window by clicking "Video" tab.
