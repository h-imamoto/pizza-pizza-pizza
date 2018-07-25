package mokumoku.pizza.clerk;

import mokumoku.pizza.order.Order;
import mokumoku.pizza.order.OrderedOrder;
import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public class CashRegister {

    public OrderedOrder receiveOrder(List<Pizza> orderProductList) {

        System.out.println("レジ : 受け付けました");

        return Order.createNewOrder(orderProductList);
    }
}
