package mokumoku.pizza.clerk;

import mokumoku.pizza.order.Order;
import mokumoku.pizza.order.OrderProduct;
import mokumoku.pizza.order.OrderedOrder;

import java.util.List;

public class CashRegister {

    public OrderedOrder receiveOrder(List<OrderProduct> orderProductList) {

        System.out.println("レジ : 受け付けました");

        return Order.createNewOrder(orderProductList);
    }
}
