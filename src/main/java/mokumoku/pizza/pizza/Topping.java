package mokumoku.pizza.pizza;

import java.util.List;

public class Topping {
    private final List<Foodstuff> value;

    public Topping(List<Foodstuff> value) {
        this.value = value;
    }

    public void add(Foodstuff foodstuff) {
        value.add(foodstuff);
    }

    public boolean contains(Foodstuff foodstuff) {
        return value.contains(foodstuff);
    }

    public Integer getSumPrice() {
        return value.stream().map(Foodstuff::getPrice).reduce(0, (a, b) -> a + b);
    }
}
