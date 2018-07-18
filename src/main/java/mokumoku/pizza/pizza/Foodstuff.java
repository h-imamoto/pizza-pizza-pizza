package mokumoku.pizza.pizza;

public enum Foodstuff {
    チーズ(100),
    チキン(100),
    おでん(2000);

    private final Integer price;

    Foodstuff(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

}
