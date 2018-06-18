package mokumoku.pizza.pizza;

public enum Pizza {

    マルゲリータ(500);

    private final Integer price;

    Pizza(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

}
