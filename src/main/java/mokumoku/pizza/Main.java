package mokumoku.pizza;

import mokumoku.pizza.clerk.CashRegister;
import mokumoku.pizza.clerk.Chef;
import mokumoku.pizza.clerk.DeliveryMan;
import mokumoku.pizza.order.Order;
import mokumoku.pizza.order.OrderCount;
import mokumoku.pizza.order.OrderProduct;
import mokumoku.pizza.order.OrderStatus;
import mokumoku.pizza.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static final Pattern UNSIGNED_INTEGER_PATTERN = Pattern.compile("^[0-9]+$");

    private static final CashRegister cashRegister = new CashRegister();
    private static final Chef chef = new Chef();
    private static final DeliveryMan deliveryMan = new DeliveryMan();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderProduct> orderProductList = receiveOrder(scanner);
        scanner.close();

        Order order = cashRegister.receiveOrder(orderProductList);
        Order cookedOrder = chef.cook(order);
        Order deliveredOrder = deliveryMan.deliver(cookedOrder);
        Integer sales = deliveredOrder.getSales();

        System.out.println("売り上げ: " + sales);
    }

    private static List<OrderProduct> receiveOrder(Scanner scanner) {
        List<OrderProduct> orderProductList = new ArrayList<>();
        boolean endOrder = false;

        do {
            System.out.print("ピザの種類はマルゲリータのみです。枚数を入力してください > ");

            String orderCount = scanner.nextLine();
            if (!UNSIGNED_INTEGER_PATTERN.matcher(orderCount).matches() || orderCount.equals("0")) {
                System.out.println("枚数は1以上の整数で指定してください！！！！");
                continue;
            }

            System.out.println("マルゲリータを" + orderCount + "枚ですね");

            orderProductList.add(new OrderProduct(Pizza.マルゲリータ, new OrderCount(Integer.parseInt(orderCount))));

            System.out.print("以上でよろしいですか？(はい:y, いいえ:それ以外) > ");

            String endOrderInput = scanner.nextLine();
            endOrder = endOrderInput.equals("y");
        } while (!endOrder);

        return orderProductList;
    }
}
