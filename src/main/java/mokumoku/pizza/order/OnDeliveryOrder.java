package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public class OnDeliveryOrder implements Order {
    private final List<Pizza> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.配達中;

    OnDeliveryOrder(List<Pizza> orderProductList) {
        this.orderProductList = orderProductList;
    }

    @Override
    public List<Pizza> getPizzaList() {
        return orderProductList;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    @Override
    public DeliveredOrder to配達完了() {
        return new DeliveredOrder(orderProductList);
    }
}
