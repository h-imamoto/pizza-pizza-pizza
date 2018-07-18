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
    public void addTopping(Foodstuff foodstuff) {
        // ピザの具材はトッピングできない
        if (pizzaMenu.contains(foodstuff)) {
            throw new RuntimeException("ピザが持っているトッピングです");
        }
        // 二重トッピングはできない
        if (topping.contains(foodstuff)) {
            throw new RuntimeException("もうトッピングしました");
        }

        topping.add(foodstuff);
    }
}
