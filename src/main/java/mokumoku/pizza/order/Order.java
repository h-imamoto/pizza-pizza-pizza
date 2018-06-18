package mokumoku.pizza.order;

import java.util.List;

public interface Order {

    List<OrderProduct> getOrderProductList();

    OrderStatus getOrderStatus();

    default OrderedOrder createNewOrder(
            List<OrderProduct> orderProductList
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

    public Order to調理中() {
        if (orderStatus != OrderStatus.申込) {
            throw new RuntimeException("調理中へ遷移できません");
        }
        return new Order(orderProductList, OrderStatus.調理中);
    }
}
