Feature: Add to cart with quantity

  Scenario Outline: add <drinks> to cart should return <msg>
    Given user select <drinks>
    And user click "Add to Cart" button
    Then system prompt <msg>
    Examples:
      | drinks         | msg              |
      | "apple juice"  | "Item Added"     |
      | "orange juice" | "Out of Stock"   |
      | "lemon juice"  | "Item not found" |
