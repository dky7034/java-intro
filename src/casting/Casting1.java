package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 11;
        long longValue = 12L;
        double doubleValue = 13.0;
//        intValue = longValue;
        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);
    }
}
