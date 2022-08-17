@smoke
  Feature: Wishlist Feature
    Scenario: adding products to Wishlist and chick the message if it appears on the top
      When user clicks on heart button
      Then assert that message appears with green background

    Scenario: adding products to Wishlist and chick the Wishlist
      When user clicks on heart button
      And user clicks on wishlist on the top
      Then assert that the qty value is bigger than 0