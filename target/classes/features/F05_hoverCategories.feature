@smoke
  Feature: hoverCategories Feature | user Experience the hover feature

    Scenario: the user will hover on one of main categories then click on sub category
      When user hover on one of the main categories Click on it and get the Text
      And get text of the page title
      Then assert that the page title is the same as the text of sub-category selected