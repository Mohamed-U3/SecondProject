@smoke
  Feature: F07_followUs | users could open followUs links
    Scenario: user opens facebook link
      Given user opens facebook link
      Then assert that Facebook link is open

    Scenario: user opens twitter link
      Given user opens twitter link
      Then assert that twitter link is open

    Scenario: user opens rss link
      Given user opens rss link
      Then assert that rss link is open

    Scenario: user opens youtube link
      Given user opens youtube link
      Then assert that youtube link is open