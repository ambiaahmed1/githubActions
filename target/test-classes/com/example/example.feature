Feature: Example Feature

  Scenario: Example scenario
    Given url 'https://jsonplaceholder.typicode.com'
    When method get
    Then status 200
    And print response
