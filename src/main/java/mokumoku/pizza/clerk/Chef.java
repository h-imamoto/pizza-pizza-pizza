package mokumoku.pizza.clerk;

import mokumoku.pizza.order.CookedOrder;
import mokumoku.pizza.order.CookingOrder;
import mokumoku.pizza.order.OrderedOrder;

public class Chef {
    public CookedOrder cook(OrderedOrder orderedOrder) {

        CookingOrder cookingOrder = orderedOrder.to調理中();
        System.out.println("シェフ : 調理開始しました");

        try {
            Thread.sleep(2000L);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        System.out.println("シェフ : 調理完了しました");
        return cookingOrder.to調理完了();
    }
}
