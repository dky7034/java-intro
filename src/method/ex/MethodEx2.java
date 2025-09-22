package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage(3, "Hello, World!");
    }

    public static void printMessage(int i, String message) {
        for (int j = 0; j < i; j++) {
            System.out.println(message);
        }
    }
}