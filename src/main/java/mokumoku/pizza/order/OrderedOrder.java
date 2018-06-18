package mokumoku.pizza.order;

import java.util.List;

public class OrderedOrder implements Order {

    private final List<OrderProduct> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.申込;

    OrderedOrder(List<OrderProduct> orderProductList) {
        this.orderProductList = orderProductList;
    }

    @Override
    public List<OrderProduct> getOrderProductList() {
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
