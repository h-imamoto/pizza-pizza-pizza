package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public class OrderedOrder implements Order {

    private final List<Pizza> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.申込;

    OrderedOrder(List<Pizza> orderProductList) {
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

    @Override
    public CookingOrder to調理中() {
        return new CookingOrder(orderProductList);
    }

}
