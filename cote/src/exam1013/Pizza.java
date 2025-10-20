package exam1013;

// 부모 클래스
public abstract class Pizza {
    public String name;
    public String size;
    public int[] prices;
    public String toppings;

    public void cook() {
        System.out.println(name + size + "을 조리합니다.");
        System.out.println(name + size + "이 완성되었습니다.");
    }

    public void serve() {
        int price;
        if (size.equals("S")) price = prices[0];
        else if (size.equals("M")) price = prices[1];
        else price = prices[2];

        System.out.println(name + size + "를 드립니다. 가격:" + price);
    }
}
