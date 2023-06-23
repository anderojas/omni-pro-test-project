Feature: Add a product to cart

  Scenario Outline: Add a mobile product to the cart successfully
    Given a customer wants to buy a product
    And he selected a category "Celulares"
    And he selected a brand <brand>
    When he adds the product <product> to cart
    Then a successful message "Se agregó tu producto en el carrito satisfactoriamente" should be displayed

    Examples:
    |brand|product|
    |"Xiaomi"|"Celular XIAOMI Redmi Note 12 128GB Gris"|
    |"Oppo"|"Celular OPPO A57 128GB Negro"|

  Scenario: View the product into the cart list
    Given a customer wants to buy a product
    And he selected a category "Celulares"
    And he selected a brand "Xiaomi"
    When he adds the product "Celular XIAOMI Redmi Note 12 128GB Gris" to cart
    And he closes the message
    Then the cart icon should have 1 product added