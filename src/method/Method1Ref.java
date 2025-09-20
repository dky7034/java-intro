package method;

public class Method1Ref {
    public static void main(String[] args) {
//        int sum = add(10, 20);
        int sum = add(1, 5);
        System.out.println("sum = " + sum);
    }

    public static int add(int a, int b) {
        System.out.println("연산 수행");
        int sum = a + b;
//        System.out.println("sum = " + sum);
        return sum;
    }
}
