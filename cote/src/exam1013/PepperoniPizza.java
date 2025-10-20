package exam1013;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() { this("M"); }

    public PepperoniPizza(String size) {
        this.name = "페페로니 피자";
        this.size = size;
        this.prices = new int[]{12000, 19000, 29000};
        this.toppings = "pepperoni";
    }

    @Override
    public void cook() {
        System.out.println(toppings + "를 추가합니다.");
        super.cook();
    }
}
