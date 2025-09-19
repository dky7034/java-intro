package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        int productMax = 10;
        String[] productNames = new String[productMax];
        int[] productPrices = new int[productMax];
        int productCount = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");

            String input = sc.nextLine(); // 입력을 문자열로 받음
            int menu;

            try {
                menu = Integer.parseInt(input); // 문자열을 정수로 변환
            } catch (NumberFormatException e) {
                System.out.println("잘못된 메뉴입니다. 숫자를 입력해주세요.");
                continue; // while문의 처음으로 돌아감
            }

            switch (menu) {
                case 1 -> {
                    if (productCount >= productMax) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다. (최대 " + productMax + "개)");
                    } else {
                        System.out.print("상품 이름을 입력하세요:");
                        productNames[productCount] = sc.nextLine().trim();

                        System.out.print("상품 가격을 입력하세요:");
                        try {
                            productPrices[productCount] = Integer.parseInt(sc.nextLine()); // 가격도 동일하게 처리
                            productCount++;
                        } catch (NumberFormatException e) {
                            System.out.println("잘못된 가격입니다. 숫자를 입력해주세요.");
                        }
                    }
                }
                case 2 -> {
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                    } else {
                        for (int j = 0; j < productCount; j++) {
                            System.out.println(productNames[j] + ": " + productPrices[j] + "원");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}