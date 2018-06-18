package mokumoku.pizza.order;

import java.util.List;

public class CookedOrder implements Order {
    private final List<OrderProduct> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.調理完了;

    CookedOrder(List<OrderProduct> orderProductList) {
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
    public OnDeliveryOrder to配達中() {
        return new OnDeliveryOrder(orderProductList);
    }
}
