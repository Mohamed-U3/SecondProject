@smoke
  Feature: homeSliders Feature | The user Examine the two slides appears on the main page
    Scenario: first slider is clickable on home page
      Given the main page first slider and click on it
      Then Assert The URL of first slider page

    Scenario: second slider is clickable on home page
      Given the main page Second slider and click on it
      Then Assert The URL of second slider page