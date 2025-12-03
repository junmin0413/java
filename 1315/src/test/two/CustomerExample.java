package test.two;

public class CustomerExample {
    public static void main(String[] args) {
        Customer cust1 = new Customer("위재성", "apple");
        Customer cust2 = new Customer("위재성", "apple", 100);
        
        int point1 = cust1.updatePoint(50);
        System.out.println(point1);

        int point2 = cust2.updatePoint(-50);
        System.out.println(point2);
        
        int point3 = cust2.setPoint(200);
        System.out.println(point3);
    }
}
