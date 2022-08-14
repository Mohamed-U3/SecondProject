@smoke
  Feature: F04_Search | User Experience the Search Feature.

    Background: Using Search in Main Page
      Given user Click on Search Text Field

    Scenario Outline: Searching on Product in Site using "Product Name".
      When I enter Product Name as "<Product>"
      Then assert the URL of the Search Page
      And the Count of the Product shell be Found
      And The Product Shell have keyword as "<Product>"
      Examples:
        | Product |
        | book    |
        | laptop  |
        | nike    |

    Scenario Outline: Searching on Product in Site using "SKU".
      When I enter Product Name as "<Product>"
      Then assert the URL of the Search Page
      And Navigate one of the products
      And Find the SKU in Page and Find it as "<Product>"
      Examples:
        | Product   |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |