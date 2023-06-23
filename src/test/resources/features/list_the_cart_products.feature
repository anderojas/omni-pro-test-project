Feature: List the products in the cart

  Scenario Outline: List the products in the cart
    Given a customer wants to buy a product
    And he selected a category "Celulares"
    And he selected a brand "Xiaomi"
    And he adds the product <product> to cart
    And he closes the message
    When he goes to the cart page
    Then he should see the product <product> in the cart list

    Examples:
    | product|
    |"Celular XIAOMI Redmi Note 12 128GB Gris"|