Feature: Delete a product from the cart

  Scenario: Delete a product from the cart
    Given a customer wants to buy a product
    And he selected a category "Celulares"
    And he selected a brand "Xiaomi"
    And he adds the product "Celular XIAOMI Redmi Note 12 128GB Gris" to cart
    And he closes the message
    And he goes to the cart page
    When he deletes the product added
    Then a message "El producto ha sido removido de su carrito." indicating the product was removed is displayed
    And he should see an empty-cart message "Tu carrito de compras está vacío."