package mokumoku.pizza.clerk;

import mokumoku.pizza.order.CookedOrder;
import mokumoku.pizza.order.DeliveredOrder;
import mokumoku.pizza.order.OnDeliveryOrder;

public class DeliveryMan {
    public DeliveredOrder deliver(CookedOrder cookedOrder) {
        OnDeliveryOrder onDeliveryOrder = cookedOrder.to配達中();
        System.out.println("配達の人 : 配達中です");

        try {
            Thread.sleep(2000L);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        System.out.println("配達の人 : 配達しました");
        return onDeliveryOrder.to配達完了();
    }
}
