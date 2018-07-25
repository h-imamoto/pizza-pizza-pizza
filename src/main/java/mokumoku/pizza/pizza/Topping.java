package mokumoku.pizza.pizza;

import java.util.List;

public class Topping {
    private final List<Foodstuff> value;

    public Topping(List<Foodstuff> value) {
        this.value = value;
    }

    public List<Foodstuff> getValue() {
        return value;
    }

    public boolean add(Foodstuff foodstuff) {
        // 二重トッピングはできない
        if (value.contains(foodstuff)) {
            return false;
        }

        return value.add(foodstuff);
    }

    public Integer getSumPrice() {
        return value.stream().map(Foodstuff::getPrice).reduce(0, (a, b) -> a + b);
    }
}
