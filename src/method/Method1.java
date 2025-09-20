package method;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("단순 계산:");
        int a = 1;
        int b = 2;
        System.out.println("a + b = " + (a + b));
        System.out.println("메서드 사용:");
        Method1 m = new Method1();
        m.add(1, 2);
    }

    private int add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("두 수의 합: " + sum);
        return sum;
    }
}
