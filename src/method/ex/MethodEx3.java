package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(1000, balance);
        balance = withdraw(20000, balance);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int amount, int balance) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }
}
