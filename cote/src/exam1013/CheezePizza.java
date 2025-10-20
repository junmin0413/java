package exam1013;

public class CheezePizza extends Pizza {
    public CheezePizza() { this("M"); }

    public CheezePizza(String size) {
        this.name = "치즈피자";
        this.size = size;
        this.prices = new int[]{10000, 15000, 25000};
        this.toppings = "cheese";
    }

    @Override
    public void cook() {
        System.out.println(toppings + "를 추가합니다.");
        super.cook();
    }
}
