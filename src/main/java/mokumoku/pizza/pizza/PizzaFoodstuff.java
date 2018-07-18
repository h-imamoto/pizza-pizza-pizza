package mokumoku.pizza.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaFoodstuff {
    private final List<Foodstuff> value;

    public List<Foodstuff> getValue() {
        return value;
    }

    public PizzaFoodstuff(List<Foodstuff> value) {
        this.value = value;
    }

    public static PizzaFoodstuff マルゲリータ() {
        List<Foodstuff> list = new ArrayList<>();
        list.add(Foodstuff.チーズ);
        return new PizzaFoodstuff(list);
    }

}
