package mokumoku.pizza.order;

import java.util.Collections;
import java.util.List;

public class Order {

    private Order(List<OrderProduct> orderProductList, OrderStatus orderStatus) {
        this.orderProductList = Collections.unmodifiableList(orderProductList);
        this.orderStatus = orderStatus;
    }

    private final List<OrderProduct> orderProductList;

    private final OrderStatus orderStatus;

    public static Order createNewOrder(
            List<OrderProduct> orderProductList
    ) {
        return new Order(orderProductList, OrderStatus.申込);
    }
}
