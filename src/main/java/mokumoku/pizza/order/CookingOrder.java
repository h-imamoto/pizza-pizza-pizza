package mokumoku.pizza.order;

import java.util.List;

public class CookingOrder implements Order {

    private final List<OrderProduct> orderProductList;
    private final OrderStatus orderStatus = OrderStatus.調理中;

    CookingOrder(List<OrderProduct> orderProductList) {
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
    public CookedOrder to調理完了() {
        return new CookedOrder(orderProductList);
    }
}
