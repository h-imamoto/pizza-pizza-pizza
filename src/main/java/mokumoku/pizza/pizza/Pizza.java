package mokumoku.pizza.pizza;

public enum Pizza {

    マルゲリータ(500);

    Pizza(Integer price) {
        this.price = price;
    }

    private final Integer price;

}
