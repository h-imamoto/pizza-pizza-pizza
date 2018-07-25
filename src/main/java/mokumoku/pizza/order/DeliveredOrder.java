package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public class DeliveredOrder implements Order {
    private final List<Pizza> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.配達完了;

    DeliveredOrder(List<Pizza> orderProductList) {
        this.orderProductList = orderProductList;
    }

    @Override
    public List<Pizza> getOrderProductList() {
        return orderProductList;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Sales getSales() {
        return new Sales(orderProductList.stream().mapToInt(Pizza::getPrice).sum());
    }
}
