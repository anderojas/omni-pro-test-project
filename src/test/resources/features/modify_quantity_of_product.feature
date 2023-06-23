Feature: Modify the quantity of the product in the cart

  Scenario Outline: Add new samples of the product
    Given a customer wants to buy a product
    And he selected a category "Celulares"
    And he selected a brand "Xiaomi"
    And he adds the product <product> to cart
    And he closes the message
    And he goes to the cart page
    When he adds new samples of the product <samples>
    Then the cart icon should have <samples> product added

    Examples:
    | product|samples|
    |"Celular XIAOMI Redmi Note 12 128GB Gris"|2|
    |"Celular XIAOMI Redmi Note 12 128GB Gris"|3|