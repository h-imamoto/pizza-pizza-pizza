package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public class DeliveredOrder implements Order {
    private final List<Pizza> pizzaList;
    private final OrderStatus orderStatus = OrderStatus.配達完了;

    DeliveredOrder(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    @Override
    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Sales getSales() {
        return new Sales(pizzaList.stream().mapToInt(Pizza::getPrice).sum());
    }
}
