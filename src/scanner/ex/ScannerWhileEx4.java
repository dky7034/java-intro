package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 상품명, 가격, 수량 초기화
        String item = "";
        int price = 0;
        int qty = 0;
        int totalPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.print("상품명을 입력하세요: ");
                    item = sc.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    price = sc.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    qty = sc.nextInt();

                    sc.nextLine(); // 개행 소비

                    if (price <= 0 || qty <= 0) {
                        System.out.println("가격과 수량은 1 이상이어야 합니다.");
                        continue;
                    }

                    totalPrice += price * qty;
                    System.out.println("현재까지 총액: " + totalPrice + "원");
                }
                case 2 -> {
                    System.out.println("총 비용: " + totalPrice);
                    totalPrice = 0;
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> {
                    System.out.println("올바른 옵션을 선택해 주세요.");
                }
            }

        }

    }
}
