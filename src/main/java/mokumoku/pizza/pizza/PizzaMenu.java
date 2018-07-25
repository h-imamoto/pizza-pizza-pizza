package mokumoku.pizza.pizza;

import java.util.Arrays;

import static mokumoku.pizza.pizza.Foodstuff.*;

public enum PizzaMenu {
    マルゲリータ(500, new PizzaFoodstuff(Arrays.asList(チーズ, トマト, バジル))),
    てりやきチキン(1000, new PizzaFoodstuff(Arrays.asList(チキン, マヨネーズ))),
    スペシャルミックス(1500, new PizzaFoodstuff(Arrays.asList(Foodstuff.values())));

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
