package cond.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("거리를 입력하세요: ");
        int d = sc.nextInt();
        if (d <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (d <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (d <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
