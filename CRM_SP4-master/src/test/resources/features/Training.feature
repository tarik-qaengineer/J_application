Feature: Training functions

Scenario: AC-1 User can find the specific course.
  Given the user logs in as "hr"
  And the user navigates to "Services" page
  And the user clicks training
  And the user copies the first course and type in find box
  When the user clicks search in training
  Then user sees the course listed in search results
  When the user navigates back to search page
  And change search option
  And clcicks go button
  Then user can find the course again

  Scenario: AC-2  User can see his/her courses under MyCourses
    Given the user logs in as "hr"
    And the user navigates to "Services" page
    And the user clicks training
    When the user goes to "My Courses"
    Then the user see his courses


  Scenario: AC-3 User can see his/her grades under GradeBook
    Given the user logs in as "hr"
    And the user navigates to "Services" page
    And the user clicks training
    When the user goes to "Grade Book"
    Then the user can see his grades
  @wip
 Scenario: AC-4 User can edit his/her Student's Profile
    Given the user logs in as "hr"
    And the user navigates to "Services" page
    And the user clicks training
    When the user goes to "Profile"
    And the user fills the form
    When the user clicks save profile
    Then the user sees the profile saved
