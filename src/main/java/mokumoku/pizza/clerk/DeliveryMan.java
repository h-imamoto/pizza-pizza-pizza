package mokumoku.pizza.clerk;

import mokumoku.pizza.order.Order;

public class DeliveryMan {
    public Order deliver(Order order) {

        try {
            Thread.sleep(2000L);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        System.out.println("配達の人 : 配達しました");
        return order.to配達完了();
    }
}
