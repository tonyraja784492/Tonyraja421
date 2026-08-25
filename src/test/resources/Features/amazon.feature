@sanity
Feature: Validate the product search in amazon

Background: 
    Given User launch the amazon application url

Scenario: verify the product search with valid product name
When User enter the product in search box
    |product1   |
    |helicopter |
    |aeroplane  |
    |kids toy   |
    |Tooth paste|
    
And User click the search button
Then It should be navigate into product listing page

@Regression @smoke
Scenario Outline: verify the product search with valid product name
  When User enter the "<product>" in search box
  And User click the search button
  Then It should be navigate into product listing page

    Examples:
        |product|
        |samsung|
        |iphone |
        |vivo   |
        |oppo   |