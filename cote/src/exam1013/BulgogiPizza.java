package exam1013;

public class BulgogiPizza extends Pizza {
    public BulgogiPizza() { this("M"); }

    public BulgogiPizza(String size) {
        this.name = "불고기 피자";
        this.size = size;
        this.prices = new int[]{10000, 13000, 18000};
        this.toppings = "bulgogi";
    }

    @Override
    public void cook() {
        System.out.println(toppings + "를 추가합니다.");
        super.cook();
    }
}
