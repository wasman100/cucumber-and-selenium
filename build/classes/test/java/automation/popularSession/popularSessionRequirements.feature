@tag
Feature: Add to cart, continue shopping, and view cart
  User should be able to add items to cart and be able to continue shopping and add more items
  he can click on cart to view all items added

  @tag1
  Scenario Outline: User should be able to click on products and be able to add to cart and continue shopping
    					and add more items as desired and be able to view correct number of added items in cart

    Given User navigates to automationpractice website
    When User will click on image with the title Faded Short Sleeve T-Shirts
    And User clicks on Add to cart on Faded Short Sleeve T-Shirts pop up page
    And User will click on Continue shopping after Faded Shirt Sleeve T-Shirt has been added to cart
    When User will click image with the title Printed Chiffllon Dress
    And User clicks on Add to cart on Printed Chiffllon Dress pop up page
    And User will click on Continue shopping after Printed Chiffllon Dress has been added to cart
    When User will click image with the title Blouse
    And User clicks on Add to cart on Blouse pop up page
    And User will click on Continue shopping after Blouse has been added to cart
    When User clicks on the Cart button
    Then User will be taken to Cart page to verify all his items were added
