package mokumoku.pizza.order;

import java.util.List;

public class DeliveredOrder implements Order {
    private final List<OrderProduct> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.配達完了;

    DeliveredOrder(List<OrderProduct> orderProductList) {
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

    public Sales getSales() {
        return new Sales(orderProductList.stream().mapToInt(OrderProduct::getTotalPrice).sum());
    }
}
