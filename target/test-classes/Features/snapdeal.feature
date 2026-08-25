Feature: Validate the product search in snapdeal

Background: 
    Given User launch the snapdeal application url

Scenario: verify the product search with valid product name in snapdeal
When User enter the product in search box in snapdeal
And User click the search button in snapdeal
Then It should be navigate into product listing page in snapdeal
