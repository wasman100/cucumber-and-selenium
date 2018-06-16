@tag
Feature: Adding different dresses to cart
  User should be able to view and add different types of dresses to cart and have correct quantiy of item inside

	
  
  @tag1
  Scenario: User will selects different dresses and add them to cart and verify the quantity is correct
    Given User navigates to automation practise website
   
    When User hovers over women 
    And User selects evening from the sub menu
    And User hovers over printed dress
    And User will click addtocart
    And User will click continue shopping
    
    When User hovers over women again
    And User selects summer from the sub menu
    And User hovers over printed chiffon dress
    And User will click addtocart two
    And User will click continue shopping two
    
    When User hovers over dresses
    And User selects casual from the sub menu
    And User hovers over printed dress again
    And User will click addtocart three
    And User will click continue shopping three
    
    Then User will hover over and click on cart button
    And User will verify there's three items in cart
  
  