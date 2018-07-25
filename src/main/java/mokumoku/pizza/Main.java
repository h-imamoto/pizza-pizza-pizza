package mokumoku.pizza;

import mokumoku.pizza.clerk.CashRegister;
import mokumoku.pizza.clerk.Chef;
import mokumoku.pizza.clerk.DeliveryMan;
import mokumoku.pizza.order.*;
import mokumoku.pizza.pizza.Foodstuff;
import mokumoku.pizza.pizza.Pizza;
import mokumoku.pizza.pizza.PizzaMenu;

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
        List<Pizza> orderProductList = receiveOrder(scanner);
        scanner.close();

        OrderedOrder orderedOrder = cashRegister.receiveOrder(orderProductList);
        CookedOrder cookedOrder = chef.cook(orderedOrder);
        DeliveredOrder deliveredOrder = deliveryMan.deliver(cookedOrder);
        Sales sales = deliveredOrder.getSales();

        System.out.println("売り上げ: " + sales.getValue() + "円です");
    }

    private static List<Pizza> receiveOrder(Scanner scanner) {
        List<Pizza> orderProductList = new ArrayList<>();
        boolean endOrder = false;

        do {

            // ピザの種類を入力する
            System.out.print("ピザの種類を入力してください マルゲリータ, てりやきチキン, スペシャルミックス > ");
            String pizzaInput = scanner.nextLine();

            boolean endTopping = false;

            Pizza pizza = new Pizza(PizzaMenu.valueOf(pizzaInput));

            do {
                // トッピングを入力する
                System.out.print("トッピングを入力してください > ");
                String topping = scanner.nextLine();
                if (pizza.addTopping(Foodstuff.valueOf(topping))) {
                    System.out.print("トッピングを追加しました > ");
                } else {
                    System.out.print("トッピングを追加できませんでした > ");
                }

                System.out.print("トッピングは以上でよろしいですか？(はい:y, いいえ:それ以外) > ");
                String toppingInput = scanner.nextLine();
                endTopping = toppingInput.equals("y");

            } while (!endTopping);


            orderProductList.add(pizza);

            System.out.print("以上でよろしいですか？(はい:y, いいえ:それ以外) > ");

            String endOrderInput = scanner.nextLine();
            endOrder = endOrderInput.equals("y");
        } while (!endOrder);

        return orderProductList;
    }
}
