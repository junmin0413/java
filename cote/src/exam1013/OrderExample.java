package exam1013;

import java.util.Scanner;

public class OrderExample {

    public static void main(String[] args) {
        Menu[] menus = new Menu[3];
        menus[0] = new Menu("과자", 2000);
        menus[1] = new Menu("콜라", 2500);
        menus[2] = new Menu("아메리카노", 4000);

        Scanner scanner = new Scanner(System.in);

        System.out.print("메뉴 번호 입력 (0~2): ");
        int orderIndex = scanner.nextInt();

        System.out.print("수량 입력: ");
        int quantity = scanner.nextInt();

        if(orderIndex >= 0 && orderIndex < menus.length && quantity > 0) {
            OrderItem item = new OrderItem(menus[orderIndex], quantity);
            System.out.println("총 가격: " + item.getPrice() + "원");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        
        scanner.close();
    }
}
