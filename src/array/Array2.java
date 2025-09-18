package array;

public class Array2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 변수

        for (int i = 0; i < students.length; i++) {
            students[i] = i + 1;
        }

        for (int num : students) {
            System.out.println(num);
        }

    }
}
