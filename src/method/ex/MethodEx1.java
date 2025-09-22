package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println(calAvg(1, 2, 3));
        System.out.println(calAvg(15, 25, 35));
    }

    public static double calAvg(int a, int b, int c) {
        int sum = a + b + c;
        return (sum / 3.0);
    }
}
