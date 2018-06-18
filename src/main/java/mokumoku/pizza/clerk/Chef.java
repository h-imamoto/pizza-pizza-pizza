package mokumoku.pizza.clerk;

import mokumoku.pizza.order.Order;

public class Chef {
    public Order cook(Order order) {

        System.out.println("シェフ : 受け付けました");

        Order cookingOrder =  order.to調理中();
        try {
            Thread.sleep(2000L);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e);
        }

        return cookingOrder.to調理完了();
    }
}
