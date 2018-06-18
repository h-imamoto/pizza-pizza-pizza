package mokumoku.pizza.order;

import java.util.List;

public class OnDeliveryOrder implements Order {
    private final List<OrderProduct> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.配達中;

    OnDeliveryOrder(List<OrderProduct> orderProductList) {
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
    public DeliveredOrder to配達完了() {
        return new DeliveredOrder(orderProductList);
    }
}
