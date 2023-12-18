Feature: Amazon.com Test
  Scenario: Amazon.com adding product
    Given User is on homepage
    When Click acccept cookies
    When Click the search button
    When Write product name
    When Click product search button
    When Filter for Shipped by Amazon
    When Filter for Apple
    When Click the first product
    When Add to card
    Then Check add card
