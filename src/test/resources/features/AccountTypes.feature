Feature: Account Types

  Scenario: Driver user
    Given the user logged in as "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"

  Scenario: Sales manager user
    Given the user logged in as "sales manager"
    When the user navigates to "Customers" "Accounts"
    Then the title contains "Accounts - CustomerS"

  Scenario: Store manager user
    Given the user logged in as "store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"


  Scenario Outline: Login with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user navigates to "<tab>" "<modules>"
    Then the title contains "<title>"

    Examples:
      | userType      | tab        | modules   | title                        |
      | driver        | Activities | Customers | Calendar Events - Activities |
      | store manager | Customers  | Accounts  | Accounts  - Customers        |
      | sales manager | Customers  | Contacts  | Contacts  - Customers        |



