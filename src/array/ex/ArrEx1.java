package array.ex;

public class ArrEx1 {
    public static void main(String[] args) {
//        int[] students = new int[5];
        int[] students = {90, 80, 70, 60, 50};

        int sum = 0;
        for (int student : students) {
            sum += student;
        }

        double avg = (double) sum / 5;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }

}
