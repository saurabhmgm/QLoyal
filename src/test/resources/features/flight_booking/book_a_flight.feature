Feature:Book a Flight

  Background:Search on flight page should be accessible


  Scenario Outline:Flight options available for booking
    Given a user visits a travel website
    And enters Origin <fromLocation>
    And enters Destination <toLocation>
    And enters a travel date <travelDate>
    When a user searches a flight
    Then a user should get at least one flight option
    Examples:
    | fromLocation | toLocation | travelDate |
    | MEL          | SYD        | 2018-10-11 |


  Scenario:Flight should be booked successfully
    Given a user searched a flight
    When user submits the booking details
    Then the flight should be booked successfully