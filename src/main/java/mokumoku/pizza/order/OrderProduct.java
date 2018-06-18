package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

public class OrderProduct {

    public OrderProduct(Pizza pizza, OrderCount orderCount) {
        this.pizza = pizza;
        this.orderCount = orderCount;
    }

    private final Pizza pizza;

    private final OrderCount orderCount;

    public Integer getTotalPrice() {
        return pizza.getPrice() * orderCount.getValue();
    }
}
