package mokumoku.pizza.clerk;

import mokumoku.pizza.order.Order;

public class Chef {
    public Order cook(Order order) {

        System.out.println("シェフ : 受け付けました");

        return order.to調理中();
    }
}
