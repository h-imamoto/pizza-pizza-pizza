package mokumoku.pizza.pizza;

import java.util.ArrayList;
import java.util.List;

public enum PizzaMenu {
    マルゲリータ(500, PizzaFoodstuff.マルゲリータ());

    private final Integer price;
    private PizzaFoodstuff pizzaFoodstuff;

    PizzaMenu(Integer price, PizzaFoodstuff pizzaFoodstuff) {
        this.price = price;
        this.pizzaFoodstuff = pizzaFoodstuff;
    }

    public boolean contains(Foodstuff foodstuff) {
        return pizzaFoodstuff.getValue().contains(foodstuff);
    }

    public Integer getPrice() {
        return price;
    }
}
