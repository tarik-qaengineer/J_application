@regression @smoke @wip
Feature: manage User Setting

    Scenario: click and display your setting
        Given The user logged in as "HR"
        Given User can display create a new task window by clicking on "New Task".
        When User can display the task which is assisted by clicking Assisting
        And User can display Ongoing task.
        And User can display existing task(s) set by him under MyTask.
        And User can display existing project(s) table.
        And User can display efficiency board.
        Then User can display Recycle Bin.