@reg
Feature: Quick navigation menu

  @message
  Scenario Outline: Authorized "<userType>" can send message on quick navigation menu
    Given the user logged in as "<userType>"
    When the user clicks message button
    And the user writes message text
    And the user puts recipient email address
    When the user clicks the send button
    Then sent message should match the last message on activity stream

    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @file
  Scenario Outline: Authorized "<userType>" can send a file on quick navigation menu
    Given the user logged in as "<userType>"
    When the user clicks More button in quick navigate menu
    And the user clicks File button
    And the user uploads file by clicking Upload files and images field
    And the user selects file by clicking Select Document from Bitrix24 field
    And the user choose recipient email address
    And the user clicks Send button
    Then sent file should match the last file on activity stream

    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @event
  Scenario Outline: Authorized "<userType>" can create an event using quick navigate menu
    Given the user logged in as "<userType>"
    And the user clicks Event button on quick navigate menu
    And the user writes event content
    And the user determines event date in calendar field
    And the user picks meeting room
    And the user picks event members by clicking searchbox
    And the user clicks Send button on event field
    Then created event should match the last event on activity stream

    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @poll
  Scenario Outline: Authorized "<userType>" can create a poll using quick navigate menu
    Given the user logged in as "<userType>"
    And the user clicks Poll button on quick navigate menu
    And the user writes poll text
    And the user picks recipient by clicking searchbox
    And the user writes question content
    And the user writes answer options
    And the user clicks send button on poll field
    Then the created poll should match the last poll on activity stream

    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @task
  Scenario Outline: Authorized "<userType>" can create a task using quick navigate menu
    Given the user logged in as "<userType>"
    And the user clicks Task button on quick navigate menu
    And the user writes task text
    And the user picks responsible person by clicking searchbox
    And the user picks deadline on calendar
    And the user clicks send button on task field
    Then the created task should match the last task on activity stream

    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @appreciation
  Scenario Outline: Authorized "<userType>" can send an appreciation using quick navigate menu
    Given the user logged in as "<userType>"
    And the user clicks more button in quick navigate menu
    And the user clicks Appreciation button
    And the user writes appreciation content
    And the user chooses recipients by clicking searchbox
    And the user clicks Send button on appreciation field
    Then the sent appreciation should match last appreciation on activity stream

    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @workflow
  Scenario Outline: Authorized "<userType>" can create a workflow using quick navigate menu
    Given the user logged in as "<userType>"
    And the user clicks more button in quick navigate menu
    And the user clicks Workflow button
    And the user clicks General requests button
    And the user writes title by clicking Title text field
    And the user writes description by clicking Description field
    And the user picks Priority level by clicking from dropdown menu
    And the user picks recipient by clicking searchbar
    And the user clicks Send button on general request field
    Then the created general request should match the last general request on activity stream

    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

