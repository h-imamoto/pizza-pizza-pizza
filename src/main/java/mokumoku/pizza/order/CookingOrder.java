package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public class CookingOrder implements Order {

    private final List<Pizza> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.調理中;

    CookingOrder(List<Pizza> orderProductList) {
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
    public CookedOrder to調理完了() {
        return new CookedOrder(orderProductList);
    }
}
