package mokumoku.pizza.clerk;

import mokumoku.pizza.order.Order;
import mokumoku.pizza.order.OrderProduct;

import java.util.List;

public class CashRegister {

    public Order receiveOrder(List<OrderProduct> orderProductList) {

        System.out.println("レジ : 受け付けました");

        return Order.createNewOrder(orderProductList);
    }
}
