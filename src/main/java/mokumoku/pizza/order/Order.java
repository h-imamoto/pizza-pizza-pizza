package mokumoku.pizza.order;

import mokumoku.pizza.pizza.Pizza;

import java.util.List;

public interface Order {

    List<Pizza> getOrderProductList();

    OrderStatus getOrderStatus();

    static OrderedOrder createNewOrder(
            List<Pizza> orderProductList
    ) {
        return new OrderedOrder(orderProductList);
    }

    default CookingOrder to調理中() {
        throw new RuntimeException("調理中に遷移できません");
    }

    default CookedOrder to調理完了() {
        throw new RuntimeException("調理完了に遷移できません");
    }

    default OnDeliveryOrder to配達中() {
        throw new RuntimeException("配達中に遷移できません");
    }

    default DeliveredOrder to配達完了() {
        throw new RuntimeException("配達完了に遷移できません");
    }

}
