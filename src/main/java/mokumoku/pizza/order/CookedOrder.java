package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public class CookedOrder implements Order {
    private final List<Pizza> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.調理完了;

    CookedOrder(List<Pizza> orderProductList) {
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
    public OnDeliveryOrder to配達中() {
        return new OnDeliveryOrder(orderProductList);
    }
}
