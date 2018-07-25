package mokumoku.pizza.pizza;

import java.util.ArrayList;

public class Pizza {

    private final PizzaMenu pizzaMenu;
    private Topping topping = new Topping(new ArrayList<>());

    public Pizza(PizzaMenu pizzaMenu) {
        this.pizzaMenu = pizzaMenu;
    }

    public Integer getPrice() {
        return pizzaMenu.getPrice() + topping.getSumPrice();
    }

    /**
     * トッピングを追加する
     */
    public boolean addTopping(Foodstuff foodstuff) {
        // ピザの具材はトッピングできない
        if (pizzaMenu.contains(foodstuff)) {
            return false;
        }

        return topping.add(foodstuff);
    }
}
