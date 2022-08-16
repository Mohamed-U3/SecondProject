@smoke
  Feature: Euro currency Feature | user Select Euro as Currency
    Scenario: Select Euro currency from the dropdown list on the top left of home page
      When User login User choose Euro as currency
      Then assert if the 4 product in same page is now in Euro